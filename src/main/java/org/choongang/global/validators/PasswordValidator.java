package org.choongang.global.validators;

public interface PasswordValidator {
    /**
     * 알파벳 복잡성 체크
     *
     * @param password
     * @param caseIncensitive - false : 대소문자 각각 1개씩 이상 포함, true - 대소문자 구분 X
     * @return
     */
    default boolean alphaCheck(String password, boolean caseIncensitive) {

        return false;
    }

    /**
     * 숫자 복잡성 체크
     *
     * @param password
     * @return
     */
    default boolean numberCheck(String password) {

        return false;
    }

    /**
     * 특수문자 복잡성 체크
     *
     * @param password
     * @return
     */
    default boolean specialCharsCheck(String password) {

        return false;
    }
}
