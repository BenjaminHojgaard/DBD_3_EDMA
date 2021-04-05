package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Colon;
import learnedma.generated.valuedomains.Comma;
import learnedma.generated.valuedomains.Key;
import learnedma.generated.valuedomains.Optional;
import learnedma.generated.valuedomains.Optional.OptionalBuilderColon;
import learnedma.generated.valuedomains.Optional.OptionalBuilderComma;
import learnedma.generated.valuedomains.Optional.OptionalBuilderKey;
import learnedma.generated.valuedomains.Optional.OptionalBuilderValue;
import learnedma.generated.valuedomains.Value;
import learnedma.generated.valuedomains.impl.ColonImpl;
import learnedma.generated.valuedomains.impl.CommaImpl;
import learnedma.generated.valuedomains.impl.KeyImpl;
import learnedma.generated.valuedomains.impl.ValueImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class OptionalBuilderImpl implements OptionalBuilderColon, OptionalBuilderComma, OptionalBuilderKey, OptionalBuilderValue
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public OptionalBuilderImpl()
    {
        edma_value = new Object[4];
    }

    /**
     * sets the comma field.
     * @param comma  The value to assign to the comma field
     * @return       Builder interface for setting the key field
     */
    public OptionalBuilderKey comma(Comma comma)
    {
        if(comma == null) throw new NullPointerException("The field comma in Optional may not be null");
        edma_value[0] = ((IValueInstance) comma).edma_getValue();
        return this;
    }

    /**
     * sets the comma field.
     * @param comma  The value to assign to the comma field
     * @return       Builder interface for setting the key field
     */
    public OptionalBuilderKey comma(String comma) throws InvalidValueException
    {
        if(comma != null) CommaImpl.edma_validate(comma);
        if(comma == null) throw new NullPointerException();
        edma_value[0] = CommaImpl.edma_create(comma);
        return this;
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the colon field
     */
    public OptionalBuilderColon key(Key key)
    {
        if(key == null) throw new NullPointerException("The field key in Optional may not be null");
        edma_value[1] = ((IValueInstance) key).edma_getValue();
        return this;
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the colon field
     */
    public OptionalBuilderColon key(String key) throws InvalidValueException
    {
        if(key != null) KeyImpl.edma_validate(key);
        if(key == null) throw new NullPointerException();
        edma_value[1] = KeyImpl.edma_create(key);
        return this;
    }

    /**
     * sets the colon field.
     * @param colon  The value to assign to the colon field
     * @return       Builder interface for setting the value field
     */
    public OptionalBuilderValue colon(Colon colon)
    {
        if(colon == null) throw new NullPointerException("The field colon in Optional may not be null");
        edma_value[2] = ((IValueInstance) colon).edma_getValue();
        return this;
    }

    /**
     * sets the colon field.
     * @param colon  The value to assign to the colon field
     * @return       Builder interface for setting the value field
     */
    public OptionalBuilderValue colon(String colon) throws InvalidValueException
    {
        if(colon != null) ColonImpl.edma_validate(colon);
        if(colon == null) throw new NullPointerException();
        edma_value[2] = ColonImpl.edma_create(colon);
        return this;
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       The created Optional value
     */
    public Optional value(Value value)
    {
        if(value == null) throw new NullPointerException("The field value in Optional may not be null");
        edma_value[3] = ((IValueInstance) value).edma_getValue();
        return new OptionalImpl(OptionalImpl.edma_create(edma_value));
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       The created Optional value
     */
    public Optional value(String value) throws InvalidValueException
    {
        if(value != null) ValueImpl.edma_validate(value);
        if(value == null) throw new NullPointerException();
        edma_value[3] = ValueImpl.edma_create(value);
        return new OptionalImpl(OptionalImpl.edma_create(edma_value));
    }
}
