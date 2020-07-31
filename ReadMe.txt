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

I'd like to discuss some limitations I encountered. In the billing function, its supposed to use the patient file that
the prescription is associated with in order to send the bill to the insurance company. However, I have replaced this
with a constant function that just prints out messages saying the insurance is accepted and the patient owes $4.00.
This was done in order to demonstrate the adjudication state only. Additionally the code lacks the patient files,
it would be important to adjust the input state in order to find the corresponding patient and attach the prescription
to his file. 

Due to the lack of functionality of the system I would like to remind anyone who would like to build on this project
that they should add functionality to the existing components. For example the input state can be expanded on by adding
a function to search through a list of patients and add the prescription to that patient's file. Additionally, once
a patient class is added, the adjudicate function would be able to access patient information to contact insurance companies.
Additionally the adjudicate functionality could be expanded by adding a client server framework in order to initiate actual
comminucations with insurance servers to do automatic billing. This can be added without changing other features of the system.

Overall, the software process is quite rigorous, as it is quite a process to develop the needs of the software based on 
user requirements. Constructing the software in an agile and flexible manner is almost necessary since there are so
many expected features to implement and it can get confusing. I thought I could develop much more than actuality and
this is because I underestimated the work. I have taken Dr. Lethbridge's advice in that I designed a minimalistic barebones
system to demonstrate functionality. I found this project to be quite exciting for myself and helped me learn a lot.


IMPORTANT NOTE FOR VIDEO:
I have attempted to record my screen multiple times, but the voice just keeps cutting out. I have included the video, but
halfway through my voice cuts out. I tried multiple recordings, I'm only left to believe my microphone is not working properly
on the hardware level. 





