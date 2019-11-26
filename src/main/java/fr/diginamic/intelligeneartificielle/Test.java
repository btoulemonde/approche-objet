package fr.diginamic.intelligeneartificielle;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

public class Test {
	public static void main(String[] args) {

	MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(3,8,2);
	
	DataSet dataSet = new DataSet(3, 2);
	DataSetRow rOne = new DataSetRow(5, 2);
	DataSetRow rTwo = new DataSetRow(8,2);
	dataSet.addRow(rOne);
	dataSet.addRow(rTwo);
	neuralNetwork.learn(dataSet);
	
	neuralNetwork.setInput(0.2,0.8,0.3);
	neuralNetwork.calculate();
	for (double output: neuralNetwork.getOutput()){
		System.out.println(output);
	}
	
	}
}
