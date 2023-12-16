package TextBookCases;

public class Case2dot1
{
    public static class Record
    {
        String name;
        char sex;
        int age;
        boolean married;

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public boolean isMarried()
        {
            return married;
        }

        public void setMarried(boolean married)
        {
            this.married = married;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public char getSex()
        {
            return sex;
        }

        public void setSex(char sex)
        {
            this.sex = sex;
        }
    }

    public static void main(String[] args)
    {
        Record you = new Record();
        Record me = new Record();

        you.setName("读者");
        you.setSex('女');
        you.setAge(22);
        you.setMarried(false);

        System.out.println(you.getName()+"  ");
        System.out.println(you.getSex()+"  ");
        System.out.println(you.getAge()+"  ");
        System.out.println(you.isMarried()+"  ");

    }
}
