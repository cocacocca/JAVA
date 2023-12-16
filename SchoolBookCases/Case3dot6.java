package SchoolBookCases;

public class Case3dot6 {
    public static void main(String[] args) {
        MyDate oday1 = new MyDate();
        MyDate oday2 = new MyDate(2020,1,1);
        MyDate oday3 = new MyDate(oday2);
        oday1.print();
        oday2.print();
        oday3.print();
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public MyDate(){
        this(2020,1,1);
    }

    public MyDate(MyDate oday){
        this(oday.year,oday.month,oday.day);
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return this.day=((day>=1)&(day<=31))?day:1;
    }

    public void setDay(int day){
        this.day=day;
    }

    public String ToString(){
        return this.year+"-"+this.month+"-"+this.day;
    }

    public void print(){
        System.out.println(this.ToString());
    }
}

