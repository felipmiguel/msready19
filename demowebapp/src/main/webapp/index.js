$(function () {
    $("#btnEcho").click(function () {
        $.post('api/tools/echo',
            $("#inputform").serialize(), function (data, status) {
                $("#result").val(data);
            });
    });
    $("#btnReverse").click(function () {
        $.post('api/tools/reverse',
            $("#inputform").serialize(), function (data, status) {
                $("#result").val(data);
            });
    });
});