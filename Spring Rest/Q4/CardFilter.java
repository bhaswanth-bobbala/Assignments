package rest.ques4;

/*
 * Create a RESTful web service that validates the credit card. It means we need to check the type
of credit card like American Express, Discover, Visa etc and it is valid or not.
Valid length: 16 digits.
First 6 digits must be in one of the following ranges:
601100 through 601109
601120 through 601149
601174
601177 through 601179
601186 through 601199
644000 through 659999
enRoute
Valid length: 15 digits. First four digits must be 2014 or 2149.
JCB
Valid length: 16 to 19 digits.
First 4 digits must be in the range 3528 through 3589.
MasterCard
Valid length: 16 digits.
First digit must be 5 and second digit must be in the range 1 through 5 inclusive. The range is
510000 through 559999.
First digit must be 2 and second digit must be in the range 2 through 7 inclusive. The range is
222100 through 272099.
Visa
Valid length: Up to 19 digits. First digit must be a 4.
 */
public class CardFilter {
	public String cardValidation(long num) {
		String result = "Invalid";
		if (String.valueOf(num).length() >= 16 && String.valueOf(num).length() <= 19) {
			if (String.valueOf(num).length() == 16) {
				num = (long) (num / Math.pow(10, 10));
				if (num >= 601100 && num <= 601109 || num >= 601120 && num <= 601149 || num == 601120
						|| num >= 601177 && num <= 601179 || num >= 601186 && num <= 601199
						|| num >= 644000 && num <= 659999) {
					result = "Valid Express Card";
				} else if (num >= 510000 && num <= 559999 || num >= 222100 && num <= 272099) {
					result = "Valid Master Card";
				}
			} else if (String.valueOf(num).length() > 16) {
				num = (long) (num / Math.pow(10, String.valueOf(num).length() - 4));
				if (String.valueOf(num).charAt(0) == '4') {
					result = "Valid Visa Card";
				} else if (num >= 3528 && num <= 3589) {
					result = "Valid JCB Card";
				}
			}
		} else if (String.valueOf(num).length() == 15) {
			num = (long) (num / Math.pow(10, 11));
			if (num >= 2014 && num <= 2149) {
				result = "Valid enRoute Card";
			}
		}
		return result;
	}
}
