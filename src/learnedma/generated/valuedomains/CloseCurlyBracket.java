package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.CloseCurlyBracketImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: CloseCurlyBracket
 */
public abstract class CloseCurlyBracket implements Comparable<CloseCurlyBracket>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(23);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The CloseCurlyBracket from the terminal
     */
    public static CloseCurlyBracket fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new CloseCurlyBracketImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The CloseCurlyBracket from the string representation
     */
    public static CloseCurlyBracket fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new CloseCurlyBracketImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The CloseCurlyBracket read from the stream
     */
    public static CloseCurlyBracket fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new CloseCurlyBracketImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The CloseCurlyBracket read from the stream
     */
    public static CloseCurlyBracket fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new CloseCurlyBracketImpl(res);
    }

    /**
     * Call this method to create a new CloseCurlyBracket value. 
     * @param value  The value of the CloseCurlyBracket to be created.
     * @return       The newly created CloseCurlyBracket value
     */
    public static CloseCurlyBracket create(String value) throws InvalidValueException
    {
        CloseCurlyBracketImpl.edma_validate(value);
        return new CloseCurlyBracketImpl(CloseCurlyBracketImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid
     * CloseCurlyBracket
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid CloseCurlyBracket
     */
    public static boolean isValidCloseCurlyBracket(String value)
    {
        try
        {
            CloseCurlyBracketImpl.edma_validate(value);
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
     * returns the String value that is stored in this CloseCurlyBracket
     * @return  The String value stored in this CloseCurlyBracket
     */
    public abstract String value();
}
