package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
// Implementa Serializable para que os arquivos possam ser transformado em sequência de bytes e, portanto, possam trafegar na rede, etc.

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
