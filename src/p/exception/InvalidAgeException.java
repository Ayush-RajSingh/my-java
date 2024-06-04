package p.exception;

public class InvalidAgeException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Invalid age is not allowed";
    }
}
