<%@page contentType="text/html; charset=UTF-8" %>

<center>
<h1>계좌 현황</h1>
<table border="1" width="700">
	<tr>
		<td colspan="2" align="center"><span style="color:red">${wooriAccount.name }</span>님의 계좌 현황입니다.</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="150">계좌 번호</td>
		<td>${wooriAccount.accountNumber }</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="150">보유 잔액</td>
		<td >${wooriAccount.balance }</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="150">마지막 출금 날짜</td>
		<td>${wooriAccount.withdrawDate }</td>
	</tr>
	<tr>
		<td bgcolor="orange" width="150">마지막 입금 날짜</td>
		<td>${wooriAccount.receiptDate }</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><a href="transferView.do?accountNumber=${wooriAccount.accountNumber }">계좌 이체</a></td>
	</tr>
</table>
</center>
