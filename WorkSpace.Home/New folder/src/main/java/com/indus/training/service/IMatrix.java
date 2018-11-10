package com.indus.training.service;

import com.indus.training.domain.MatrixInput;
import com.indus.training.domain.MatrixOutput;

public interface IMatrix {

	public MatrixOutput addition(MatrixInput matrixInObj);
	
	public MatrixOutput subtract(MatrixInput matrixInObj);
}
