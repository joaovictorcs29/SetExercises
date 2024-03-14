package entities;

import java.util.Objects;

public class Students {

    private Integer number;

    public Students(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(number, students.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
