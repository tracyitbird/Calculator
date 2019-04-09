package exercise2;
public class Exercise_3_1 {

	private static final short OPERATION_NUMBER = 50;
	private static final short COLUMN_NUMBER = 5;
	private BinaryOperation_3_1 operationList[] = new BinaryOperation_3_1[OPERATION_NUMBER];

	// 在数组中增加算术运算题前先检查是否已经在数组中，以避免重复，
	public void generateBinaryExercise() {
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateBinaryOperation();
			while (contains(anOperation, i - 1)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation;
		}
	}

	public void generateAdditionExercise() {
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateAdditionOperation();
			while (contains(anOperation, i - 1)) {
				anOperation = opCreator.generateAdditionOperation();
			}
			operationList[i] = anOperation;
		}
	}

	public void generateSubstractExercise() {
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateSubstractOperation();
			while (contains(anOperation, i - 1)) {
				anOperation = opCreator.generateSubstractOperation();
			}
			operationList[i] = anOperation;
		}
	}

	// 只要产生的算式没在当前练习题中，就加入尾部
	private boolean contains(BinaryOperation_3_1 anOperation, int length) {
		boolean found = false;
		for (int i = 0; i <= length; i++) {
			// System.out.println("--"+i+"--");
			if (anOperation.equals(operationList[i])) {
				found = true;
				break;
			}
		}
		return found;
	}

	void formateAndDisplay() {
		int count = 1;
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			if (count > COLUMN_NUMBER) {
				print("\n");
				count = 1;
			}
			print("" + (i + 1) + "." + "   ");
			print(operationList[i].asString() + "\t");
			count++;
		}
		print("\n");
	}

	void printAll(int count) {
		for (int i = 0; i < count; i++) {
			print(operationList[i].fullString());
			print(", ");
		}
		System.out.println();
	}

	void printAll() {
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			print(operationList[i].asString());
			print(", ");
		}
		print("\n");
	}

	private static void print(String str) {
		System.out.print(str);
	}

	public static void main(String[] args) {

		// 产生一个Exercise对象，内容是空
		Exercise_3_1 anExercise = new Exercise_3_1();

		System.out.println("屏幕显示50道加法运算题：");
		anExercise.generateAdditionExercise();
		anExercise.formateAndDisplay();

		System.out.println("屏幕显示50道减法运算题：");
		anExercise.generateSubstractExercise();
		anExercise.formateAndDisplay();

		anExercise.generateBinaryExercise();
		System.out.println("屏幕显示50道加法或减法运算题：");
		anExercise.formateAndDisplay();

	}
}