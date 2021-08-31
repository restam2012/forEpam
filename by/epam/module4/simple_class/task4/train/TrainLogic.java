package by.epam.module4.simple_class.task4.train;

import java.util.ArrayList;
import java.util.List;

import by.epam.module4.simple_class.task4.Date.Date;

public class TrainLogic {

	// Сортировка вставками
	public Train[] sortByNumber(Train[] train) {
		Train buffer;
		int num;

		for (int left = 1; left < train.length; left++) {
			buffer = train[left];
			num = train[left].getTrainNum();

			int i;

			i = left - 1;
			for (; i >= 0; i--) {
				if (num < train[i].getTrainNum()) {
					train[i + 1] = train[i];
				} else {
					break;
				}
			}

			train[i + 1] = buffer;
		}

		return train;
	}

	public Train[] getSelectedNumOfTrain(Train[] train, int num) {
		
		List<Train> listOfTrain = new ArrayList<Train>();
		Train[] massOfTrain;

		for (Train t : train) {
			if (t.getTrainNum() == num) {
				listOfTrain.add(t);
			}
		}
		
		massOfTrain = new Train[listOfTrain.size()];
		for(int i = 0; i < massOfTrain.length; i++) {
			massOfTrain[i] = listOfTrain.get(i);
		}
		return massOfTrain;
	}

	public Train[] sortByDestinationAndTime(Train[] train) {		
		train = sortByDestination(train);
		
		train = sortByTimeAfterDestination(train);

		return train;
	}

	private Train[] sortByDestination(Train[] train) {
		Train buffer;
		String destination;

		for (int left = 1; left < train.length; left++) {
			buffer = train[left];
			destination = train[left].getDestination();

			int i;

			i = left - 1;
			for (; i >= 0; i--) {
				if (destination.compareTo(train[i].getDestination()) < 0) {
					train[i + 1] = train[i];
				} else {
					break;
				}
			}

			train[i + 1] = buffer;
		}
		
		return train;
	}

	private Train[] sortByTimeAfterDestination(Train[] train) {
		Train buffer;
		Date date;

		for (int left = 1; left < train.length; left++) {

			buffer = train[left];
			date = train[left].getDate();

			int i;

			i = left - 1;
			for (; i >= 0; i--) {

				if (!train[i].getDestination().equals(train[left].getDestination())) {
					break;
				}

				if (date.compareTo(train[i].getDate()) == -1) {
					train[i + 1] = train[i];
				} else {
					break;
				}
			}

			train[i + 1] = buffer;
		}

		return train;
	}

}
