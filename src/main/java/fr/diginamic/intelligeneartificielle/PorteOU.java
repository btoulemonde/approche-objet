package fr.diginamic.intelligeneartificielle;

import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;

public class PorteOU {

	public static void main(String[] args) {

		MultiLayerPerceptron porteOU = new MultiLayerPerceptron(2, 5, 1);
		DataSet dataSet = new DataSet(2, 1);
		DataSetRow rOne = new DataSetRow(new double[] { 0, 0 }, new double[] { 0 });
		DataSetRow rTwo = new DataSetRow(new double[] { 0, 1 }, new double[] { 1 });
		DataSetRow rThree = new DataSetRow(new double[] { 1, 0 }, new double[] { 1 });
		DataSetRow rfour = new DataSetRow(new double[] { 1, 1 }, new double[] { 1 });

		dataSet.addRow(rOne);
		dataSet.addRow(rTwo);
		dataSet.addRow(rThree);
		dataSet.addRow(rfour);
		
		for (int i = 0; i <20; i++) {
			porteOU.learn(dataSet);
		}

		porteOU.setInput(1, 1);
		porteOU.calculate();
		double[] resultat = porteOU.getOutput();
		System.out.println(resultat[0]);

		porteOU.setInput(1, 0);
		porteOU.calculate();
		resultat = porteOU.getOutput();
		System.out.println(resultat[0]);

		porteOU.setInput(0, 1);
		porteOU.calculate();
		resultat = porteOU.getOutput();
		System.out.println(resultat[0]);

		porteOU.setInput(0, 0);
		porteOU.calculate();
		resultat = porteOU.getOutput();
		System.out.println(resultat[0]);

	}
}
