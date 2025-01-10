package wzk.experiment.eleven;

/**
 * @author PlagueWZK
 * description: B
 * date: 2025/1/2 20:36
 */

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class BankDeposit {
    public static void main(String[] args) {
        LocalDateTime depositDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
        String formattedDepositDate = depositDate.format(formatter);

        BigDecimal depositAmount = new BigDecimal("15000.75");

        LocalDateTime withdrawalDate = depositDate.plusDays(100);
        String formattedWithdrawalDate = withdrawalDate.format(formatter);

        BigDecimal interestRate = new BigDecimal("0.005");
        BigDecimal withdrawalAmount = depositAmount.multiply(BigDecimal.ONE.add(interestRate).pow(1));

        String idCard = "123456789012345678";
        boolean isValidIdCard = validateIdCard(idCard);

        String phoneNumber = "13245667890";
        boolean isValidPhone = validatePhoneNumber(phoneNumber);

        System.out.println("存款单：");
        System.out.println("存款日期：" + formattedDepositDate);
        System.out.println("存款金额：" + depositAmount + " 元");
        System.out.println("取款日期：" + formattedWithdrawalDate);
        System.out.println("预计取款金额：" + withdrawalAmount + " 元");
        System.out.println("身份证号有效：" + isValidIdCard);
        System.out.println("手机号有效：" + isValidPhone);
    }

    public static boolean validateIdCard(String idCard) {
        String regex = "^[1-9]\\d{5}(\\d{4}|\\d{2})\\d{2}\\d{2}\\d{3}[0-9Xx]$";
        return Pattern.matches(regex, idCard);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "^1[3-9]\\d{9}$";
        return Pattern.matches(regex, phoneNumber);
    }
}
