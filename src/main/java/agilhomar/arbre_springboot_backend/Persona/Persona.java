package agilhomar.arbre_springboot_backend.Persona;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Persones")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    public String Name;
    public String Surname1;
    public String Surname2;
    private Persona Mother;
    public Persona Father;
    public Date DateOfBirth;
    public Date DateOfDecase;
    public String ImagesFolder;
    public Persona() {

    }
    public Persona(String name, String surname1, String surname2,
                   Persona mother, Persona father, Date dateOfBirth,
                   Date dateOfDecase, String imagesFolder) {
        this.Name = name;
        this.Surname1 = surname1;
        this.Surname2 = surname2;
        this.Mother = mother;
        this.Father = father;
        this.DateOfBirth = dateOfBirth;
        this.DateOfDecase = dateOfDecase;
        this.ImagesFolder = imagesFolder;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname1() {
        return Surname1;
    }

    public void setSurname1(String surname1) {
        Surname1 = surname1;
    }

    public String getSurname2() {
        return Surname2;
    }

    public void setSurname2(String surname2) {
        Surname2 = surname2;
    }

    public Persona getFather() {
        return Father;
    }

    public void setFather(Persona father) {
        Father = father;
    }

    public Persona getMother() {
        return Mother;
    }

    public void setMother(Persona mother) {
        Mother = mother;
    }

    public String getImagesFolder() {
        return ImagesFolder;
    }

    public void setImagesFolder(String imagesFolder) {
        ImagesFolder = imagesFolder;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Date getDateOfDecase() {
        return DateOfDecase;
    }

    public void setDateOfDecase(Date dateOfDecase) {
        DateOfDecase = dateOfDecase;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", Name='" + Name + '\'' +
                ", Surname1='" + Surname1 + '\'' +
                ", Surname2='" + Surname2 + '\'' +
                ", Mother='" + Mother + '\'' +
                ", Father='" + Father + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", DateOfDecase='" + DateOfDecase + '\'' +
                ", ImageFolder='" + ImagesFolder +
                '}';
    }
}
