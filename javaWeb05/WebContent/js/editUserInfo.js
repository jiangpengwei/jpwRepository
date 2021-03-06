function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var url = decodeURI(decodeURI(window.location.search));
	var r = url.substr(1).match(reg);
	if (r != null) {
		return unescape(r[2]);
	}
	return null;
}
$(function() {
	var u_id = getQueryString("u_id");
	var u_name = getQueryString("u_name");
	var u_pwd = getQueryString("u_pwd");
	$("#u_id").val(u_id);
	$("#u_name").val(u_name);
	$("#u_pwd").val(u_pwd);
});