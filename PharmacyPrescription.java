/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.0.5074.a43557235 modeling language!*/

import java.util.*;

/**
 * UML state diagram of a pharmacy prescription
 * Author Rakan Al Tamimi
 */
// line 5 "model.ump"
// line 182 "model.ump"
public class PharmacyPrescription
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PharmacyPrescription Attributes
  private String patientName;
  private String doctorPrescribing;
  private String drugName;
  private int quantity;
  private int refills;
  private String sig;
  private boolean cancel;
  private boolean confirm;
  private boolean cancelUnfill;
  private boolean rebill;
  private boolean refill;
  private boolean reinput;
  private boolean modify;
  private boolean hold;

  //PharmacyPrescription State Machines
  public enum Status { Input, Adjudicate, Filling, PharmacistCheck, Cancelled, Hold, WaitingForPickup }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PharmacyPrescription()
  {
    patientName = new String("blank");
    doctorPrescribing = new String("blank");
    drugName = new String("blank");
    quantity = 0;
    refills = 0;
    sig = new String("blank");
    cancel = false;
    confirm = false;
    cancelUnfill = false;
    rebill = false;
    refill = false;
    reinput = false;
    modify = false;
    hold = false;
    setStatus(Status.Input);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPatientName(String aPatientName)
  {
    boolean wasSet = false;
    patientName = aPatientName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDoctorPrescribing(String aDoctorPrescribing)
  {
    boolean wasSet = false;
    doctorPrescribing = aDoctorPrescribing;
    wasSet = true;
    return wasSet;
  }

  public boolean setDrugName(String aDrugName)
  {
    boolean wasSet = false;
    drugName = aDrugName;
    wasSet = true;
    return wasSet;
  }

  public boolean setQuantity(int aQuantity)
  {
    boolean wasSet = false;
    quantity = aQuantity;
    wasSet = true;
    return wasSet;
  }

  public boolean setRefills(int aRefills)
  {
    boolean wasSet = false;
    refills = aRefills;
    wasSet = true;
    return wasSet;
  }

  public boolean setSig(String aSig)
  {
    boolean wasSet = false;
    sig = aSig;
    wasSet = true;
    return wasSet;
  }

  public boolean setCancel(boolean aCancel)
  {
    boolean wasSet = false;
    cancel = aCancel;
    wasSet = true;
    return wasSet;
  }

  public boolean setConfirm(boolean aConfirm)
  {
    boolean wasSet = false;
    confirm = aConfirm;
    wasSet = true;
    return wasSet;
  }

  public boolean setCancelUnfill(boolean aCancelUnfill)
  {
    boolean wasSet = false;
    cancelUnfill = aCancelUnfill;
    wasSet = true;
    return wasSet;
  }

  public boolean setRebill(boolean aRebill)
  {
    boolean wasSet = false;
    rebill = aRebill;
    wasSet = true;
    return wasSet;
  }

  public boolean setRefill(boolean aRefill)
  {
    boolean wasSet = false;
    refill = aRefill;
    wasSet = true;
    return wasSet;
  }

  public boolean setReinput(boolean aReinput)
  {
    boolean wasSet = false;
    reinput = aReinput;
    wasSet = true;
    return wasSet;
  }

  public boolean setModify(boolean aModify)
  {
    boolean wasSet = false;
    modify = aModify;
    wasSet = true;
    return wasSet;
  }

  public boolean setHold(boolean aHold)
  {
    boolean wasSet = false;
    hold = aHold;
    wasSet = true;
    return wasSet;
  }

  public String getPatientName()
  {
    return patientName;
  }

  /**
   * Name of doctor prescribing
   */
  public String getDoctorPrescribing()
  {
    return doctorPrescribing;
  }

  /**
   * Name of drug prescribed
   */
  public String getDrugName()
  {
    return drugName;
  }

  /**
   * Quantity prescribed
   */
  public int getQuantity()
  {
    return quantity;
  }

  /**
   * Number of refills prescribed
   */
  public int getRefills()
  {
    return refills;
  }

  /**
   * Specific directions for use of medication
   */
  public String getSig()
  {
    return sig;
  }

  public boolean getCancel()
  {
    return cancel;
  }

  public boolean getConfirm()
  {
    return confirm;
  }

  public boolean getCancelUnfill()
  {
    return cancelUnfill;
  }

  public boolean getRebill()
  {
    return rebill;
  }

  public boolean getRefill()
  {
    return refill;
  }

  public boolean getReinput()
  {
    return reinput;
  }

  public boolean getModify()
  {
    return modify;
  }

  public boolean getHold()
  {
    return hold;
  }

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean cancel()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Input:
        // line 31 "model.ump"
        setCancel(true);
        setStatus(Status.Cancelled);
        wasEventProcessed = true;
        break;
      case Adjudicate:
        // line 44 "model.ump"
        setCancel(true);
        setStatus(Status.Cancelled);
        wasEventProcessed = true;
        break;
      case Filling:
        // line 54 "model.ump"
        setCancel(true);
        setStatus(Status.Cancelled);
        wasEventProcessed = true;
        break;
      case PharmacistCheck:
        // line 62 "model.ump"
        setCancel(true);
        setStatus(Status.Cancelled);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean confirm()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Input:
        // line 32 "model.ump"
        setConfirm(true);
        setStatus(Status.Adjudicate);
        wasEventProcessed = true;
        break;
      case Adjudicate:
        // line 40 "model.ump"
        setConfirm(true);
        setStatus(Status.Filling);
        wasEventProcessed = true;
        break;
      case Filling:
        // line 52 "model.ump"
        setConfirm(true);
        setStatus(Status.PharmacistCheck);
        wasEventProcessed = true;
        break;
      case PharmacistCheck:
        // line 61 "model.ump"
        setConfirm(true);
        setStatus(Status.WaitingForPickup);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean reBillChanges()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Adjudicate:
        // line 41 "model.ump"
        setRebill(true);
        setStatus(Status.Adjudicate);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean modifyInput()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Adjudicate:
        // line 42 "model.ump"
        setModify(true);
        setStatus(Status.Input);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean cancelUnfill()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Adjudicate:
        // line 43 "model.ump"
        setCancelUnfill(true);
        setStatus(Status.Hold);
        wasEventProcessed = true;
        break;
      case Filling:
        // line 53 "model.ump"
        setCancelUnfill(true);
        setStatus(Status.Hold);
        wasEventProcessed = true;
        break;
      case PharmacistCheck:
        // line 63 "model.ump"
        setCancelUnfill(true);
        setStatus(Status.Hold);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean rebill()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case PharmacistCheck:
        // line 64 "model.ump"
        setRebill(true);
        setStatus(Status.Adjudicate);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean refill()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case PharmacistCheck:
        // line 65 "model.ump"
        setRefill(true);
        setStatus(Status.Filling);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean reinput()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case PharmacistCheck:
        // line 66 "model.ump"
        setReinput(true);
        setStatus(Status.Input);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Input:
        // line 27 "model.ump"
        setReinput(false);
      inputFunction();
        break;
      case Adjudicate:
        // line 35 "model.ump"
        setConfirm(false);
      setRebill(false);
      billingFunction();
        break;
      case Filling:
        // line 47 "model.ump"
        setRefill(false);
      setConfirm(false);
      printPrescription();
        break;
      case PharmacistCheck:
        // line 57 "model.ump"
        setConfirm(false);
      printPrescription();
        break;
      case Cancelled:
        // line 69 "model.ump"
        setCancel(false);
      cancelPrescription();
        break;
      case Hold:
        // line 75 "model.ump"
        setCancelUnfill(false);
      holdPrescription();
        break;
      case WaitingForPickup:
        // line 81 "model.ump"
        setConfirm(false);
      pickUp();
        break;
    }
  }

  public void delete()
  {}

  // line 88 "model.ump"
   public void inputFunction(){
    //Function to input prescription values
    
    Scanner sc= new Scanner(System.in);   
    System.out.println("Enter Name of Doctor: ");  
    String str= sc.nextLine();
    doctorPrescribing = str;

    System.out.println("Enter the name of Patient");
    str = sc.nextLine();
    patientName = str;    

    System.out.println("Enter the name of the medication prescribed: ");
    str= sc.nextLine();
    drugName = str;
    
    System.out.println("Enter quantity prescribed:");
    str= sc.nextLine();
    quantity = Integer.parseInt(str);
    
    System.out.println("Enter number of refills:");
    str= sc.nextLine();
    refills = Integer.parseInt(str);
    
    System.out.println("Enter the instructions on use provided by MD:");
    str= sc.nextLine();
    sig = str;
  }

  // line 117 "model.ump"
   public void billingFunction(){
    System.out.println("Billing insurance companies....");
    System.out.println("Insurance accepted. Patient owes $4.00");
  }

  // line 121 "model.ump"
   public void printPrescription(){
    System.out.println("Patient: " + patientName);
    System.out.println("Doctor: " + doctorPrescribing);
    System.out.println("Drug Name: " + drugName);
    System.out.println("Quantity: " + quantity);
    System.out.println("Number of Refills: " + refills);
    System.out.println("Sig: " + sig);
  }

  // line 129 "model.ump"
   public void cancelPrescription(){
    System.out.println("Prescription cancelled.");
  }

  // line 132 "model.ump"
   public void holdPrescription(){
    System.out.println("Presciption placed on hold.");
  }

  // line 135 "model.ump"
   public void pickUp(){
    System.out.println("Prescription has been prepared. Ready for pickup.");
  }


  public String toString()
  {
    return super.toString() + "["+
            "patientName" + ":" + getPatientName()+ "," +
            "doctorPrescribing" + ":" + getDoctorPrescribing()+ "," +
            "drugName" + ":" + getDrugName()+ "," +
            "quantity" + ":" + getQuantity()+ "," +
            "refills" + ":" + getRefills()+ "," +
            "sig" + ":" + getSig()+ "," +
            "cancel" + ":" + getCancel()+ "," +
            "confirm" + ":" + getConfirm()+ "," +
            "cancelUnfill" + ":" + getCancelUnfill()+ "," +
            "rebill" + ":" + getRebill()+ "," +
            "refill" + ":" + getRefill()+ "," +
            "reinput" + ":" + getReinput()+ "," +
            "modify" + ":" + getModify()+ "," +
            "hold" + ":" + getHold()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 138 "model.ump"
  public static void main (String args[]) 
  {
    System.out.println("--- Test 1: create prescription then cancel.--- ");
    PharmacyPrescription test1 = new PharmacyPrescription();
    test1.cancel(); //cancel
    System.out.println("-- Test 1 concluded. ---"); 
   
    System.out.println("--- Test 2: create a prescription and bill it, then cancel. ---");
    PharmacyPrescription test2 = new PharmacyPrescription();
    test2.confirm();  //go to adjudicate
    test2.cancel();   //cancel
    System.out.println("-- Test 2 concluded. ---"); 
    
    System.out.println("--- Test 3: create a prescription and bill it, then cancel in the filling stage. ---");
    PharmacyPrescription test3 = new PharmacyPrescription();
    test3.confirm();  //go to adjudicate
    test3.confirm();  //go to filling
    test3.cancel();   //go to cancel
    System.out.println("-- Test 3 concluded. ---");
    
    System.out.println("--- Test 4: create a prescription and follow till drop off. ---");
    PharmacyPrescription test4 = new PharmacyPrescription();
    test4.confirm();  //go to adjudicate
    test4.confirm();  //go to filling
    test4.confirm();  //go to pharmacist check
    test4.confirm();  //go to Waiting for Pickup
    System.out.println("-- Test 4 concluded. ---");
    
    System.out.println("--- Test 5: create a prescription and has the pharmacist rebill, refill, then drop off. ---");
    PharmacyPrescription test5 = new PharmacyPrescription();
    test5.confirm(); //adjudicate
    test5.confirm();  //filling
    test5.confirm(); //pharmacist check
    test5.rebill();     //back to adjudicate to rebill
    test5.confirm(); //filling 
    test5.confirm(); //pharmacist check
    test5.confirm(); // ready for pick up
    System.out.println("-- Test 5 concluded. ---");
  }

  
}