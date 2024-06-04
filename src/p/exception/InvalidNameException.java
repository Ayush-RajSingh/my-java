package p.exception;

public class InvalidNameException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Invalid Name is not allowed";
    }
}
