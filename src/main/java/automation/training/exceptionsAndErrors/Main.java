package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.IllegalMarkException;
import automation.training.exceptionsAndErrors.exceptions.StudentHasNoSubjectsException;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
        Subjects english = new Subjects("English");
        Subjects math = new Subjects("Math");
        Subjects economy = new Subjects("Economy");

        Student ivan = new Student(english, 8);
        ivan.addSubjectWithMark(math, 7);
        ivan.addSubjectWithMark(economy, 9);

        Student petr = new Student(english, 10);
        petr.addSubjectWithMark(math, 2);
        petr.addSubjectWithMark(economy, 5);

        Student alex = new Student(english, 4);
        alex.addSubjectWithMark(math, 9);
        alex.addSubjectWithMark(economy, 7);

        Student misha = new Student(english, 6);
        misha.addSubjectWithMark(math, 8);
        misha.addSubjectWithMark(economy, 4);

        Student sergey = new Student(english, 7);
        sergey.addSubjectWithMark(math, 6);
        sergey.addSubjectWithMark(economy, 9);

        Student pasha = new Student(english, 6);
        pasha.addSubjectWithMark(math, 7);
        pasha.addSubjectWithMark(economy, 4);

       // Student alisa = new Student(null, 15);

        Group g1 = new Group(11);
        g1.addStudent(petr);
        g1.addStudent(ivan);
        Group g2 = new Group(12);
        g2.addStudent(alex);
        g2.addStudent(misha);
        Group b1 = new Group(21);
        b1.addStudent(sergey);
        b1.addStudent(pasha);
        Group b2 = new Group(22);

        Faculty GEO = new Faculty();
        GEO.addGroup(g1);
        Faculty BIO = new Faculty();
        BIO.addGroup(g2);
        Faculty ATF = new Faculty();
        ATF.addGroup(b1);
        ATF.addGroup(b2);
        Faculty MSF = new Faculty();


        University bsu = new University();
        bsu.addFaculties(GEO);
        bsu.addFaculties(BIO);
        University bnty = new University();
        bnty.addFaculties(ATF);
        bnty.addFaculties(MSF);

        System.out.println("Cредний балл по всем предметам студента  " + Methods.averageMarkOfAllSubjectsOfStudent(alex));

        System.out.println("Cредний балл по конкретному предмету в конкретной группе и на конкретном факультете " +
                Methods.averageMarkOfSubjectOfGroupOfFaculty(economy, 11, GEO));

        System.out.println("Cредний балл по предмету для всего университета " +
                Methods.averageMarkOfSubjectInUniversity(math, bsu));


    }
}
