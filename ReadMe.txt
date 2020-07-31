Rakan Al Tamimi
8643845
SEG 2105

For the final project I havve decided to look into a pharmacy software for managing prescriptions.
Over the course of the summer, I have found a part time job as a pharmacy assistant. I have found the
softawre named 'Kroll' to be quite interesting and as I learned throughout the course I saw more and more
of possible ways to design such a software. While the software is actually quite complicated and includes many features
that I will definitley not be able to design, I thought of trying to look at the basics of the software and attempt a
design that covers basic functionality. I have will utilize everything I learned in this semester to attempt a 
professional design for this software. In order to get some user stories to illustrate the functionality and use of
the software I have asked members of my team to tell me what they expect of pharmacy software in their terms. Below are
some user stories.

Pharmacist: 
	    I need to be able to check all prescriptions that are processed to ensure the quality of service at our
	    pharmacy. I would also like to be able to cancel any prescription that does not meet the standards in order
            to have it refilled the right way. I would also like to keep track of all my prescriptions that have been
            processed at the pharmacy so that in the case of a recall I can contact patients so that they should
            stop using the medication immediately. I need my assistants to be able to scan a copy of the prescription
	    so that I can check their work against the original.

Pharmacy Assistant:
            I need to be able to input a prescription(paper copy from MD) into the system in order to begin processing it.
            I will need to input several pieces of important information: the doctor prescribing, the name of medication,
            whether a generic substitute is allowed, the quantity and number of refills prescribed, and the sig left by
	    the doctor explaining how to take the medication. All this information for the prescription should be able to
 	    be added to the patient's file, where i would be able to see all prescriptions associated with the patient.
	    Additionally I need to be able to adjudicate all prescriptions inputted and process them through to insurance
            companies if the patient has insurance. After the adjudication I will need to fill the prescription in order
	    to have it checked by the pharmacist before dispensing.
            

I'd like to talk a little about my design. I have decided to create a state diagram for prescriptions as it is one
of the main components of a pharmacy software. I have developed a brief design of a system where a prescription is
inputted, then billed to insurance companies(if possible), filled, and lastly checked by the pharmacist before being
flagged as "ready for pick up". Inside my state diagram, there is a main function which runs 5 simple test cases to
test the reliability of the system. The system takes input initially from the user in order to simulate the inputting
of a prescription. I have a console based UI for now, with the addition of several buttons to be able to follow
the state diagram. The console input is primarily for inputting the prescription infromation.

In order to run the test program, download the java file PharmacyPrescription.java and compile it then run it.
It will prompt you to input information for the prescription and then will run a test for the prescription.





