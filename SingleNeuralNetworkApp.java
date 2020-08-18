

public class SingleNeuralNetworkApp {
	public static void main(String[] args) {
		float[][] input = { {0,0}, {0,1}, {1,0}, {1,1} };
		float[] output = {0,0,0,1};
		Perceptron perceptron = new Perceptron(input, output);
		perceptron.train(0.1f);
		System.out.println("The error is 0 so our neural network is ready! Predictions: ");
		System.out.println(perceptron.calculateOutput(new float[]{0,0}));
		System.out.println(perceptron.calculateOutput(new float[]{0,1}));
		System.out.println(perceptron.calculateOutput(new float[]{1,0}));
		System.out.println(perceptron.calculateOutput(new float[]{1,1}));
		
	}
}
/*
Updated weight: 0.0
Updated weight: 0.0
Updated weight: 0.0
Updated weight: 0.0
Updated weight: 0.0
Updated weight: 0.0
Updated weight: 0.1
Updated weight: 0.1
Keep on training the network, error is: 1.0
Updated weight: 0.1
Updated weight: 0.1
Updated weight: 0.1
Updated weight: 0.1
Updated weight: 0.1
Updated weight: 0.1
Updated weight: 0.2
Updated weight: 0.2
Keep on training the network, error is: 1.0
Updated weight: 0.2
Updated weight: 0.2
Updated weight: 0.2
Updated weight: 0.2
Updated weight: 0.2
Updated weight: 0.2
Updated weight: 0.3
Updated weight: 0.3
Keep on training the network, error is: 1.0
Updated weight: 0.3
Updated weight: 0.3
Updated weight: 0.3
Updated weight: 0.3
Updated weight: 0.3
Updated weight: 0.3
Updated weight: 0.4
Updated weight: 0.4
Keep on training the network, error is: 1.0
Updated weight: 0.4
Updated weight: 0.4
Updated weight: 0.4
Updated weight: 0.4
Updated weight: 0.4
Updated weight: 0.4
Updated weight: 0.5
Updated weight: 0.5
Keep on training the network, error is: 1.0
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Updated weight: 0.5
Keep on training the network, error is: 0.0
The error is 0 so our neural network is ready! Predictions:
0.0
0.0
0.0
1.0
 */