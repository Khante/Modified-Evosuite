package org.evosuite.ga.operators.crossover;

import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ConstructionFailedException;
import org.evosuite.utils.Randomness;


public class DiscreteCrossOver extends CrossOverFunction {



	/**
	 * {@inheritDoc}
	 */
	@Override
	public void crossOver(Chromosome parent1, Chromosome parent2)
			throws ConstructionFailedException {

		if (parent1.size() < 2 || parent2.size() < 2) {
			return;
		}

		int maxNumGenes = Math.min(parent1.size(), parent2.size());

		Chromosome t1 = parent1.clone();
		Chromosome t2 = parent2.clone();

		for (int i = 0; i < maxNumGenes; i++) {
			if (Randomness.nextDouble() <= 0.5) {
				parent1.crossOver(t2, i);
				parent2.crossOver(t1, i); //less than 0.5  different gene
			}
			else {
				parent1.crossOver(t1,i);
				parent2.crossOver(t2,i);
			}
		}
	}
}

