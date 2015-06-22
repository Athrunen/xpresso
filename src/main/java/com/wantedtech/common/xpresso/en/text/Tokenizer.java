package com.wantedtech.common.xpresso.en.text;


import java.io.*;
import java.util.Iterator;

import com.wantedtech.common.xpresso.x;
import com.wantedtech.common.xpresso.en.sentence.Sentence;
import com.wantedtech.common.xpresso.token.Token;
import com.wantedtech.common.xpresso.types.list;
import com.wantedtech.common.xpresso.types.set;

/**
* A fast, rule-based tokenizer implementation, which produces Penn Treebank
* style tokenization of English text.
*/
public class Tokenizer extends AbstractTokenizer implements Iterable<Sentence> {

	public static final set<String> SENTENCE_DELIMS = x.set(".", "?", "!", "!!", "!!!", "??", "?!", "!?");
	
	// the underlying lexer
	private final Lexer lexer;
	
	/**
	* Constructs a new Tokenizer.
	*
	* @param r The Reader to read tokens from
	*/
	public Tokenizer(String s) {
		lexer = new Lexer(new StringReader(s));
	}
	
	/**
	* Internally fetches the next token.
	*
	* @return the next token in the token stream, or null if none exists.
	*/
	protected Token getNext() {
		try {
			return lexer.next();
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public Iterator<Sentence> iterator() {
		return new Iterator<Sentence> () {
			Token next = null;
			Sentence nextSent = new Sentence();
			@Override
			public boolean hasNext() {
				nextSent.clear();
				next = getNext();
				
				if (next == null) {
					nextSent = null;
					return false;
				}
				
				while (next != null) {
					nextSent.append(next);
					
					if (next.in(SENTENCE_DELIMS)) {
						break;
					}
					
					next = getNext();
				};

				return x.isNotEmpty(nextSent);
			}

			@Override
			public Sentence next() {
				return nextSent.copy();
			}
		};
	}
}