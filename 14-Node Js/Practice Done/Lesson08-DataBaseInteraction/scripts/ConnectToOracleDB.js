let connection;
var oracledb = require('oracledb');

oracledb.getConnection(
	{
		user: 'HR',
		password: 'HR',
		connectString: 'localhost/XE'
	},
	function (err, connection) {
		if (err) {
			console.error("db has connected failed: " + err.message);
			return;
		}

		console.log("db has connected ");

		//read one
		readOne(connection);

		//doRelease(connection);
	});
function readOne(connection) {
	var sql = "select * from DEPARTMENTS";
	var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}

		//console.log(result);
		console.log(result.rows);
	});
}