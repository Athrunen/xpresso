package com.wantedtech.common.xpresso.comprehension;

import java.util.ArrayList;

public class Tuple2ComprehensionFor {

	Tuple2Comprehension comprehension;
	
	public Tuple2ComprehensionFor(Tuple2Comprehension comprehension){
		this.comprehension = comprehension;
	}
	
	public Tuple2ComprehensionFinal forIter(Iterable<Object> elements){
		this.comprehension.forIter(elements);
		return new Tuple2ComprehensionFinal(this.comprehension);
	}
	
	public Tuple2ComprehensionFinal forIter(Object element0,Object element1,Object... elements){
		ArrayList<Object> inputList = new ArrayList<Object>();
		inputList.add(element0);
		inputList.add(element1);
		for (Object element : elements){
			inputList.add(element);
		}
		this.comprehension.forIter(inputList);
		return new Tuple2ComprehensionFinal(this.comprehension);
	}
	
}
