class University {
	void announcement()	{
		System.out.println("exams stars form 1st dec");
	}
	class Depeartment {
		void examPapers()	{
			System.out.println("exam papers are being prepared");
		}
	}
}

class MemberInner {
	public static void main(String args[])	{
		University jntu = new University();
		jntu.announcement();
		University.Depeartment cse = jntu.new Depeartment();
		cse.examPapers();
	}
}
