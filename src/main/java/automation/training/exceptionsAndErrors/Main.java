package automation.training.exceptionsAndErrors;

import automation.training.exceptionsAndErrors.exceptions.*;

public class Main {
    public static void main(String[] args) throws IllegalMarkException, StudentHasNoSubjectsException, NoStudentsInGroupException, NoGroupsAtFacultyException, NoFacultiesException {
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

        Student misha = new Student(english, 7);
        misha.addSubjectWithMark(math, 10);
        misha.addSubjectWithMark(economy, 8);

        Student sergey = new Student(english, 7);
        sergey.addSubjectWithMark(math, 6);
        sergey.addSubjectWithMark(economy, 9);

        Student pasha = new Student(english, 6);
        pasha.addSubjectWithMark(math, 7);
        pasha.addSubjectWithMark(economy, 4);

       // Student alisa = new Student(null, 15);

        Group geo2020 = new Group(11);
        geo2020.addStudent(petr);
        geo2020.addStudent(ivan);
        Group geo2021 = new Group(12);
        geo2021.addStudent(alex);
        geo2021.addStudent(misha);
        Group bio2020 = new Group(21);
        bio2020.addStudent(sergey);
        Group bio2021 = new Group(22);
        bio2021.addStudent(pasha);

        Faculty geo = new Faculty("geo");
        geo.addGroup(geo2020);
        Faculty bio = new Faculty("bio");
        bio.addGroup(geo2021);
        Faculty atf = new Faculty("atf");
        atf.addGroup(bio2020);
        atf.addGroup(bio2021);
//        Faculty msf = new Faculty("msf");


        University bsu = new University("BSU");
        bsu.addFaculties(geo);
        bsu.addFaculties(bio);
        University bnty = new University("BNTY");
        bnty.addFaculties(atf);
//        bnty.addFaculties(msf);

        System.err.println("Average score in all subjects of the student  " + Methods.averageMarkOfAllSubjectsOfStudent(misha));

        System.err.println("Average score in a specific subject in a specific group and in a specific faculty " +
                Methods.averageMarkOfSubjectOfGroupOfFaculty(atf, 21, economy));

        System.err.println("Subject average for the entire university " +
                Methods.averageMarkOfSubjectInUniversity(bnty, math));


    }
}
