<%@page contentType="text/html; charset=UTF-8" %>

<center>
<h1>계좌 이체하기</h1>
<form action="transferResult.do" method="post">
	<table border="1" width="700">
		<tr>
			<td bgcolor="orange" width="150">계좌 번호</td>
			<td><input type="hidden" name="accountNumber" value="${wooriAccount.accountNumber }">${wooriAccount.accountNumber }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="150">이체 가능 금액</td>
			<td><input type="hidden" name="balance" value="${wooriAccount.balance }">${wooriAccount.balance }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="150">이체 금액</td>
			<td><input type="text" name="amount">원</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="150">이체할 은행</td>
			<td>
				<select name="bankName">
					<option value="WOORI">우리은행
					<option value="SINHAN">신한은행
					<option value="KB">국민은행
					<option value="HANA">하나은행
					<option value="SC">SC제일은행
					<option value="NH">농협
					<option value="SH">신협
					<option value="CH">축협
				</select>
			</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="150">이체할 계좌 번호</td>
			<td><input type="text" name="transferAccount"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="이체하기"></td>
		</tr>
	</table>
</form>
</center>
