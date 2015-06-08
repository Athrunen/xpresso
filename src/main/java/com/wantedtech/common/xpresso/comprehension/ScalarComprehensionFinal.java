package com.wantedtech.common.xpresso.comprehension;

import java.util.Iterator;

import com.wantedtech.common.xpresso.experimental.helpers.Helpers;
import com.wantedtech.common.xpresso.functional.Predicate;
import com.wantedtech.common.xpresso.types.list;

public class ScalarComprehensionFinal<O> implements Iterable<O> {

	ScalarComprehension<O> comprehension;
	
	public ScalarComprehensionFinal(ScalarComprehension<O> comprehension){
		this.comprehension = comprehension;	
	}
	
	public Iterable<O> when(Predicate<Object> scalarPredicate){
		this.comprehension.when(scalarPredicate);
		return Helpers.newArrayList(comprehension);
	}
	
	public Iterable<O> unless(Predicate<?> scalarPredicate){
		this.comprehension.unless(scalarPredicate);
		return Helpers.newArrayList(comprehension);
	}
	
	/*public Iterable<O> ifElementNot(Predicate<?> scalarPredicate){
		this.comprehension.ifElementNot(scalarPredicate);
		return Helpers.newArrayList(comprehension);
	}*/

	public Iterator<O> iterator() {
		return this.comprehension.iterator();
	}
	
	public String toString() {
		return this.comprehension.toString();
	}

}
