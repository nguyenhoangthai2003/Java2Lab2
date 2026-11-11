public class Student {
    private String id;
    private String name;
    private StudentType type;

    public Student(String id, String name, StudentType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() { 
        return id; 
    }

    public String getName() { 
        return name;
    }

      public StudentType getType() { 
        return type; 
    }

    public void setId(String id) { 
        this.id = id;
     }
    public void setName(String name) { 
        this.name = name;
    }

    public void setType(StudentType type) { 
        this.type = type; 
    }

  @Override
public String toString() {
    return String.format("| %-8s | %-22s | %-15s | %-25s |", 
            id, name, type.name(), type.getDescription());
}
}
