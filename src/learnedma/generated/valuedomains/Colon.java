package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.ColonImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Colon
 */
public abstract class Colon implements Comparable<Colon>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(26);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Colon from the terminal
     */
    public static Colon fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ColonImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Colon from the string representation
     */
    public static Colon fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ColonImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Colon read from the stream
     */
    public static Colon fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ColonImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Colon read from the stream
     */
    public static Colon fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ColonImpl(res);
    }

    /**
     * Call this method to create a new Colon value. 
     * @param value  The value of the Colon to be created.
     * @return       The newly created Colon value
     */
    public static Colon create(String value) throws InvalidValueException
    {
        ColonImpl.edma_validate(value);
        return new ColonImpl(ColonImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Colon
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Colon
     */
    public static boolean isValidColon(String value)
    {
        try
        {
            ColonImpl.edma_validate(value);
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
     * returns the String value that is stored in this Colon
     * @return  The String value stored in this Colon
     */
    public abstract String value();
}
