package com.me.ums.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserNotFoundByIdException extends RuntimeException
{
	private String message;
}
