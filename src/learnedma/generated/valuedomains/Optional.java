package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.Colon;
import learnedma.generated.valuedomains.Comma;
import learnedma.generated.valuedomains.Key;
import learnedma.generated.valuedomains.Value;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.OptionalBuilderImpl;
import learnedma.generated.valuedomains.impl.OptionalImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Optional
 */
public abstract class Optional implements Comparable<Optional>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(29);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Optional from the terminal
     */
    public static Optional fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new OptionalImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Optional from the string representation
     */
    public static Optional fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new OptionalImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Optional read from the stream
     */
    public static Optional fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new OptionalImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Optional read from the stream
     */
    public static Optional fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new OptionalImpl(res);
    }

    /**
     * Starts creation of a new Optional
     * @return  Builder interface to set the comma field
     */
    public static OptionalBuilderComma create()
    {
        return new OptionalBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field comma
     * @return  The value of the field comma
     */
    public abstract Comma comma();

    /**
     * returns the value of the field key
     * @return  The value of the field key
     */
    public abstract Key key();

    /**
     * returns the value of the field colon
     * @return  The value of the field colon
     */
    public abstract Colon colon();

    /**
     * returns the value of the field value
     * @return  The value of the field value
     */
    public abstract Value value();


    /**
     * Builder interface for setting the comma field of Optional
     */
    public interface OptionalBuilderComma
    {

        /**
         * sets the comma field.
         * @param comma  The value to assign to the comma field
         * @return       Builder interface for setting the key field
         */
        public OptionalBuilderKey comma(Comma comma);

        /**
         * sets the comma field.
         * @param comma  The value to assign to the comma field
         * @return       Builder interface for setting the key field
         */
        public OptionalBuilderKey comma(String comma) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the key field of Optional
     */
    public interface OptionalBuilderKey
    {

        /**
         * sets the key field.
         * @param key  The value to assign to the key field
         * @return     Builder interface for setting the colon field
         */
        public OptionalBuilderColon key(Key key);

        /**
         * sets the key field.
         * @param key  The value to assign to the key field
         * @return     Builder interface for setting the colon field
         */
        public OptionalBuilderColon key(String key) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the colon field of Optional
     */
    public interface OptionalBuilderColon
    {

        /**
         * sets the colon field.
         * @param colon  The value to assign to the colon field
         * @return       Builder interface for setting the value field
         */
        public OptionalBuilderValue colon(Colon colon);

        /**
         * sets the colon field.
         * @param colon  The value to assign to the colon field
         * @return       Builder interface for setting the value field
         */
        public OptionalBuilderValue colon(String colon) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the value field of Optional
     */
    public interface OptionalBuilderValue
    {

        /**
         * sets the value field.
         * @param value  The value to assign to the value field
         * @return       The created Optional value
         */
        public Optional value(Value value);

        /**
         * sets the value field.
         * @param value  The value to assign to the value field
         * @return       The created Optional value
         */
        public Optional value(String value) throws InvalidValueException;

    }

}
