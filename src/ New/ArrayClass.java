public class ArrayClass<T> {
	private T[] array;

	public void setT(T[] array) {
		this.array = array;
		return;
	}

	public T[] getT() {
		return this.array;
	}

	public static void main(String[] args) {
		ArrayClass<String> a = new ArrayClass<String>();
		String[] beauty = { "XiShi", "WangZhaojvn", "DiaoChan", "YangGuifei" };
		a.setT(beauty);
		for (int i = 0; i < beauty.length; i++) {
			System.out.println(a.getT()[i].toString());
		}
	}
}
