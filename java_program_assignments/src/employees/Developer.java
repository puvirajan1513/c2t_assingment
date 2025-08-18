package employees;


public class Developer extends Employees {
	private String programlang;
	
	public Developer(String name,String employeeId,double salary,String programlang) {
		super(name,employeeId,salary);
		this.programlang=programlang;
	}

	
	public String getProgramlang() {
		return programlang;
	}

	public void setProgramlang(String programlang) {
		this.programlang = programlang;
	}
	@Override

	public String dis(){
		return "Developer [programlang=" + programlang + "]";
	}
	

}
