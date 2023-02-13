package com.achievers.OnlineCourseManagement;

import java.util.Scanner;

import com.achievers.OnlineCourseManagement.entity.Course;
import com.achievers.OnlineCourseManagement.service.CourseService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int mOption = 0;
		System.out.println("Welcome to Online Course Enrollment System");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Main Menu\n1.Course Management \n2.Learner Management\n3.Exit\n");
		System.out.println("Enter your choice: ");
		mOption = ip.nextInt();
		while (mOption == 1 || mOption == 2) {
			switch (mOption) {
			case 1:
				CourseService cSvc = new CourseService();
				int sOption = 0;
				int cID = 0;
				String cName = "";
				int cDuration = 0;
				float cCost = 0.0f;
				Course c;

				System.out.println("\nCourse Management");
				System.out.println("-----------------");
				System.out.println(
						"\n1.Add Course\n2.View Course\n3.View All Courses\n4.update COurse\n5.Delete Course\n6.Exit");

				System.out.println("Enter your choice: ");
				sOption = ip.nextInt();

				switch (sOption) {
				case 1:
					System.out.println("Add a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Course Name:");
					cName = ip.next();
					System.out.println("Enter the Course Duration:");
					cDuration = ip.nextInt();
					System.out.println("Enter the Course Cost:");
					cCost = ip.nextFloat();
					c = new Course(cID, cName, cDuration, cCost);
					System.out.println(cSvc.addCourse(c));
					break;
				case 2:
					System.out.println("View a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					c = cSvc.getCourse(cID);
					if (c != null)
						System.out.println(c);
					else
						System.out.println("Course Unavilable");
					break;
				case 3:
					System.out.println("View "+cSvc.getAllCourse().size()+" Course");
					System.out.println("CID\tCNAME\tCDURATION    CCOST   \tNoOfLearners");
					for(Course c1:cSvc.getAllCourse()) {
						System.out.println(c1.getCourseId()+"\t"+c1.getCourseName()+"\t   "+c1.getCourseDuration()+"\t    "+c1.getCourseCost()+"\t   "+c1.getNoOfLearners());
					}
					System.out.println();
					break;
				case 4:
					System.out.println("Update a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Course Name:");
					cName = ip.next();
					System.out.println("Enter the Course Duration:");
					cDuration = ip.nextInt();
					System.out.println("Enter the Course Cost:");
					cCost = ip.nextFloat();
					c = new Course(cID, cName, cDuration, cCost);
					System.out.println(cSvc.updateCourse(cID, c));
					break;
				case 5:
					System.out.println("Delete a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println(cSvc.deleteCourse(cID));
					break;
				case 6:
					System.out.println("Thank you for working with Course Management..");
					break;
				default:
					System.out.println("Wrong Option");
					break;
				}
				break;
			}
			System.out.println("Would you like to continue with COurse or Learner ? Press 1 -  Coourse or 2 - Learner");
			mOption = ip.nextInt();

		}
	}
}
