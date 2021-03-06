package com.ciyo.common.exception;

/**
 * 基础异常
 * 
 * @author ruoyi
 */
public class BaseException extends Exception
{
    private static final long serialVersionUID = 1L;

    /**
     * 所属模块
     */
    private String module;

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误码对应的参数
     */
    private Object[] args;

    /**
     * 错误消息
     */
    private String defaultMessage;

    public BaseException(String module, int code, Object[] args, String defaultMessage)
    {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String module, int code, Object[] args)
    {
        this(module, code, args, null);
    }
    public BaseException(String module, int code, String message)
    {
        this(module, code,null, message);
    }
    public BaseException(String module, String defaultMessage)
    {
        this(module, 0, null, defaultMessage);
    }

    public BaseException(int code, Object[] args)
    {
        this(null, code, args, null);
    }

    public BaseException(String defaultMessage)
    {
        this(null, 0, null, defaultMessage);
    }

    public String getModule()
    {
        return module;
    }

    public int getCode()
    {
        return code;
    }

    public Object[] getArgs()
    {
        return args;
    }

    public String getDefaultMessage()
    {
        return defaultMessage;
    }
}
