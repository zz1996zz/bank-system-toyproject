<%@page contentType="text/html; charset=UTF-8" %>

<center>
<h1>WOORI 은행 계좌번호를 입력하세요</h1>
<form action="getBalance.do" method="post">
	<table border="1" width="700">
		<tr>
			<td bgcolor="orange">계좌번호</td>
			<td><input type="text" name="accountNumber"/></td>
		</tr>
		<tr>
		<td colspan="2" align="center">
			<input type="submit" value="잔액 확인" />
		</td>
	</tr>
	</table>
</form>
</center>
