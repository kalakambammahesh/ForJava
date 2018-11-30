class Student{
    private String name;
    private float cgpa;
    private int id;

    public Student(String name, String cgpa, String id){
        this.name = name;
        this.cgpa = Float.parseFloat(cgpa);
        this.id = Integer.parseInt(id);
    }
    public String getName(){
        return name;
    }
    public float getCgpa(){
        return cgpa;
    }
    public int getId(){
        return id;
    }
}