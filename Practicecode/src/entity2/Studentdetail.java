package entity2;

public class Studentdetail {

		private int Sid;
		private String Sname;
		private String dept;
		private int year;
		private String Mobileno;
		public int getSid() {
			return Sid;
		}
		public void setSid(int sid) {
			Sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getMobileno() {
			return Mobileno;
		}
		public void setMobileno(String mobileno) {
			Mobileno = mobileno;
		}
		@Override
		public String toString() {
			return "Student [Student id=" + Sid + ", Student name=" + Sname + ", Student dept=" + dept + ", Student Graduation year=" + year + ", Student Mobileno="
					+ Mobileno + "]";
		}
		
		
	}


