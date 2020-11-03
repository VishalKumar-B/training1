class UniversityOne	{
	void announcementOne()	{
		System.out.println("exam starts form dec 1");
		class DepartmentOne	{
			void examPapers()	{
				System.out.println("exampapers are being prepared");
			}
		}
		DepartmentOne cse1 = new DepartmentOne();
		cse1.examPapers();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		UniversityOne jntu1 = new UniversityOne();
		jntu1.announcementOne();

	}

}