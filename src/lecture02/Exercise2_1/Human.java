package lecture02.Exercise2_1;

public class Human {
    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        if (this.age <= 18){
            System.out.println("生徒："+this.name+" "+this.age+"歳です。");
        } else if(this.age <=22){
            System.out.println("学生："+this.name+" "+this.age+"歳です。");
        } else {
            System.out.println(this.name+" "+this.age+"歳です。");
        }
    }
}
