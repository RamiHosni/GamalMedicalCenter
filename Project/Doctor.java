public class Doctor extends Person implements info {

    String specialzation;
    int yearsOfExp;
    static int DoctorCounter;

    public Doctor() {
    }

    public Doctor(String n, int a, int yoe, String sp) {
        super(n, a);
        yearsOfExp = yoe;
        specialzation = sp;
    }

    public void SetSpecilization(String sp)

    {
        specialzation = sp;
    }

    public void SetYearsOfExp(int yoe)

    {
        yearsOfExp = yoe;
    }

    public String getSpecilization()

    {
        return specialzation;
    }

    public int getYearsOfexp()

    {
        return yearsOfExp;
    }

    public void printinfo() {
        System.out.printf("Name" + name, "Age" + age, "Years of exp" + yearsOfExp);
    }

    public static int getDC() {
        return DoctorCounter++;
    }

    public String toString() {
        return this.getName() + " " + this.getAge() + " " + this.getSpecilization();
    }
}
