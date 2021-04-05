package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.CommaImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Comma
 */
public abstract class Comma implements Comparable<Comma>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(24);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Comma from the terminal
     */
    public static Comma fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new CommaImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Comma from the string representation
     */
    public static Comma fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new CommaImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Comma read from the stream
     */
    public static Comma fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new CommaImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Comma read from the stream
     */
    public static Comma fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new CommaImpl(res);
    }

    /**
     * Call this method to create a new Comma value. 
     * @param value  The value of the Comma to be created.
     * @return       The newly created Comma value
     */
    public static Comma create(String value) throws InvalidValueException
    {
        CommaImpl.edma_validate(value);
        return new CommaImpl(CommaImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Comma
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Comma
     */
    public static boolean isValidComma(String value)
    {
        try
        {
            CommaImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the String value that is stored in this Comma
     * @return  The String value stored in this Comma
     */
    public abstract String value();
}
