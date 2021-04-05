package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Mobile;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.Person;
import learnedma.generated.valuedomains.Person.PersonBuilderEmail;
import learnedma.generated.valuedomains.Person.PersonBuilderFirstName;
import learnedma.generated.valuedomains.Person.PersonBuilderLastName;
import learnedma.generated.valuedomains.Person.PersonBuilderMobile;
import learnedma.generated.valuedomains.impl.EmailImpl;
import learnedma.generated.valuedomains.impl.MobileImpl;
import learnedma.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class PersonBuilderImpl implements PersonBuilderEmail, PersonBuilderFirstName, PersonBuilderLastName, PersonBuilderMobile
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PersonBuilderImpl()
    {
        edma_value = new Object[4];
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(Name firstName)
    {
        if(firstName == null) throw new NullPointerException("The field firstName in Person may not be null");
        edma_value[0] = ((IValueInstance) firstName).edma_getValue();
        return this;
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(String firstName) throws InvalidValueException
    {
        if(firstName != null) NameImpl.edma_validate(firstName);
        if(firstName == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(firstName);
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(Name lastName)
    {
        if(lastName == null) throw new NullPointerException("The field lastName in Person may not be null");
        edma_value[1] = ((IValueInstance) lastName).edma_getValue();
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(String lastName) throws InvalidValueException
    {
        if(lastName != null) NameImpl.edma_validate(lastName);
        if(lastName == null) throw new NullPointerException();
        edma_value[1] = NameImpl.edma_create(lastName);
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the mobile field
     */
    public PersonBuilderMobile email(Email email)
    {
        if(email == null) throw new NullPointerException("The field email in Person may not be null");
        edma_value[2] = ((IValueInstance) email).edma_getValue();
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the mobile field
     */
    public PersonBuilderMobile email(String email) throws InvalidValueException
    {
        if(email != null) EmailImpl.edma_validate(email);
        if(email == null) throw new NullPointerException();
        edma_value[2] = EmailImpl.edma_create(email);
        return this;
    }

    /**
     * sets the mobile field.
     * @param mobile  The value to assign to the mobile field
     * @return        The created Person value
     */
    public Person mobile(Mobile mobile)
    {
        if(mobile == null) throw new NullPointerException("The field mobile in Person may not be null");
        edma_value[3] = ((IValueInstance) mobile).edma_getValue();
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }

    /**
     * sets the mobile field.
     * @param mobile  The value to assign to the mobile field
     * @return        The created Person value
     */
    public Person mobile(String mobile) throws InvalidValueException
    {
        if(mobile != null) MobileImpl.edma_validate(mobile);
        if(mobile == null) throw new NullPointerException();
        edma_value[3] = MobileImpl.edma_create(mobile);
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }
}
