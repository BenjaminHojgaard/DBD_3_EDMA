package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.OpenCurlyBracketImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: OpenCurlyBracket
 */
public abstract class OpenCurlyBracket implements Comparable<OpenCurlyBracket>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(22);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The OpenCurlyBracket from the terminal
     */
    public static OpenCurlyBracket fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new OpenCurlyBracketImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The OpenCurlyBracket from the string representation
     */
    public static OpenCurlyBracket fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new OpenCurlyBracketImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The OpenCurlyBracket read from the stream
     */
    public static OpenCurlyBracket fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new OpenCurlyBracketImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The OpenCurlyBracket read from the stream
     */
    public static OpenCurlyBracket fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new OpenCurlyBracketImpl(res);
    }

    /**
     * Call this method to create a new OpenCurlyBracket value. 
     * @param value  The value of the OpenCurlyBracket to be created.
     * @return       The newly created OpenCurlyBracket value
     */
    public static OpenCurlyBracket create(String value) throws InvalidValueException
    {
        OpenCurlyBracketImpl.edma_validate(value);
        return new OpenCurlyBracketImpl(OpenCurlyBracketImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid
     * OpenCurlyBracket
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid OpenCurlyBracket
     */
    public static boolean isValidOpenCurlyBracket(String value)
    {
        try
        {
            OpenCurlyBracketImpl.edma_validate(value);
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
     * returns the String value that is stored in this OpenCurlyBracket
     * @return  The String value stored in this OpenCurlyBracket
     */
    public abstract String value();
}
