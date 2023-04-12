//package com.longtv.btlon1.utils;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//public class Convert {
//
//    public static void main(String[] args) {
//        String s = StringUtils.join
//        JSONArray jsonArray = new JSONArray("[\n" +
//                "  {\n" +
//                "    \"Key\": \"enter_voucher\",\n" +
//                "    \"Vietnam value\": \"<u>Chọn hoặc nhập mã giảm giá</u>\",\n" +
//                "    \"English value\": \"<u>Select or enter a discount code</u>\",\n" +
//                "    \"Peru value\": \"<u>Seleccione o ingrese un código de descuento</u>\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"price_strike\",\n" +
//                "    \"Vietnam value\": \"<strike>3.000đ</strike>\",\n" +
//                "    \"English value\": \"<strike>3,000 VND</strike>\",\n" +
//                "    \"Peru value\": \"<strike>3000 VND</strike>\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"app_name\",\n" +
//                "    \"Vietnam value\": \"TV360\",\n" +
//                "    \"English value\": \"TV360\",\n" +
//                "    \"Peru value\": \"TV360\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"facebook_app_id\",\n" +
//                "    \"Vietnam value\": \"\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"facebook_client_token\",\n" +
//                "    \"Vietnam value\": \"\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"fb_login_protocol_scheme\",\n" +
//                "    \"Vietnam value\": \"\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"google_server_client_id\",\n" +
//                "    \"Vietnam value\": \"\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"later\",\n" +
//                "    \"Vietnam value\": \"ĐỂ SAU\",\n" +
//                "    \"English value\": \"LATER\",\n" +
//                "    \"Peru value\": \"Después\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"loading\",\n" +
//                "    \"Vietnam value\": \"Loading&#8230;\",\n" +
//                "    \"English value\": \"Loading&#8230;\",\n" +
//                "    \"Peru value\": \"Cargando&#8230;\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_error\",\n" +
//                "    \"Vietnam value\": \"Lỗi\",\n" +
//                "    \"English value\": \"Error\",\n" +
//                "    \"Peru value\": \"Error\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"cancel\",\n" +
//                "    \"Vietnam value\": \"Hủy\",\n" +
//                "    \"English value\": \"Cancel\",\n" +
//                "    \"Peru value\": \"Cancelar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"ok\",\n" +
//                "    \"Vietnam value\": \"ĐỒNG Ý\",\n" +
//                "    \"English value\": \"AGREE\",\n" +
//                "    \"Peru value\": \"ACEPTAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"ignoreFollow\",\n" +
//                "    \"Vietnam value\": \"Từ chối\",\n" +
//                "    \"English value\": \"Refuse\",\n" +
//                "    \"Peru value\": \"Rechazar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"register_up\",\n" +
//                "    \"Vietnam value\": \"ĐĂNG KÝ\",\n" +
//                "    \"English value\": \"REGISTER\",\n" +
//                "    \"Peru value\": \"REGISTRARSE\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"register\",\n" +
//                "    \"Vietnam value\": \"Đăng ký\",\n" +
//                "    \"English value\": \"Register\",\n" +
//                "    \"Peru value\": \"Registrarse\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"sendSMS\",\n" +
//                "    \"Vietnam value\": \"Gửi tin nhắn\",\n" +
//                "    \"English value\": \"Send Message\",\n" +
//                "    \"Peru value\": \"Enviar mensaje\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"cancel_package\",\n" +
//                "    \"Vietnam value\": \"Hủy\",\n" +
//                "    \"English value\": \"Cancel\",\n" +
//                "    \"Peru value\": \"Cancelar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"extend_package\",\n" +
//                "    \"Vietnam value\": \"Gia hạn\",\n" +
//                "    \"English value\": \"Extend\",\n" +
//                "    \"Peru value\": \"Extender\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"close\",\n" +
//                "    \"Vietnam value\": \"Đóng\",\n" +
//                "    \"English value\": \"Close\",\n" +
//                "    \"Peru value\": \"Cerca\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"button_login_again\",\n" +
//                "    \"Vietnam value\": \"ĐĂNG NHẬP LẠI\",\n" +
//                "    \"English value\": \"RE-LOGIN\",\n" +
//                "    \"Peru value\": \"REINICIAR SESIÓN\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_login_session_expried\",\n" +
//                "    \"Vietnam value\": \"Phiên đăng nhập đã hết hạn hoặc tài khoản của bạn đã được đăng nhập trên một thiết bị khác.\",\n" +
//                "    \"English value\": \"The login session has expired or your account is already signed in on another device.\",\n" +
//                "    \"Peru value\": \"La sesión ha caducado o su cuenta ya ha iniciado sesión en otro dispositivo.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"scanner_activity\",\n" +
//                "    \"Vietnam value\": \"Quét mã QR trên smartTV\",\n" +
//                "    \"English value\": \"Scan QR code on smartTV\",\n" +
//                "    \"Peru value\": \"Escanear código QR en smartTV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"toggle_flash\",\n" +
//                "    \"Vietnam value\": \"Đèn flash\",\n" +
//                "    \"English value\": \"Flash light\",\n" +
//                "    \"Peru value\": \"Linterna\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"flash_on\",\n" +
//                "    \"Vietnam value\": \"Đèn flash [BẬT]\",\n" +
//                "    \"English value\": \"Flash [ON]\",\n" +
//                "    \"Peru value\": \"Linterna [PRENDIDO]\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"flash_off\",\n" +
//                "    \"Vietnam value\": \"Đèn flash [TẮT]\",\n" +
//                "    \"English value\": \"Flash [OFF]\",\n" +
//                "    \"Peru value\": \"Linterna [APAGADO]\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_focus_on\",\n" +
//                "    \"Vietnam value\": \"Tự động lấy nét [BẬT]\",\n" +
//                "    \"English value\": \"Autofocus [ON]\",\n" +
//                "    \"Peru value\": \"Enfoque automático [PRENDIDO]\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_focus_off\",\n" +
//                "    \"Vietnam value\": \"Tự động lấy nét [TẮT]\",\n" +
//                "    \"English value\": \"Autofocus [OFF]\",\n" +
//                "    \"Peru value\": \"Enfoque automático [APAGADO]\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"choose_formats\",\n" +
//                "    \"Vietnam value\": \"Chọn định dạng mã\",\n" +
//                "    \"English value\": \"Choose code format\",\n" +
//                "    \"Peru value\": \"Elija el formato de código\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"select_camera\",\n" +
//                "    \"Vietnam value\": \"Chọn máy ảnh\",\n" +
//                "    \"English value\": \"Choose a camera\",\n" +
//                "    \"Peru value\": \"Selecciona la cámara\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"ok_button\",\n" +
//                "    \"Vietnam value\": \"Đồng ý\",\n" +
//                "    \"English value\": \"Agree\",\n" +
//                "    \"Peru value\": \"Aceptar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"cancel_button\",\n" +
//                "    \"Vietnam value\": \"Hủy\",\n" +
//                "    \"English value\": \"Cancel\",\n" +
//                "    \"Peru value\": \"Cancelar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"updating\",\n" +
//                "    \"Vietnam value\": \"Đang cập nhật\",\n" +
//                "    \"English value\": \"Updating\",\n" +
//                "    \"Peru value\": \"Actualizando\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"watch_late\",\n" +
//                "    \"Vietnam value\": \"Xem sau\",\n" +
//                "    \"English value\": \"Watch it later\",\n" +
//                "    \"Peru value\": \"Ver más tarde\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"offline_message\",\n" +
//                "    \"Vietnam value\": \"Mất kết nối mạng. Quý khách vui lòng kiểm tra lại!\",\n" +
//                "    \"English value\": \"Lost Internet connection. Please check again!\",\n" +
//                "    \"Peru value\": \"Perdió su conexión a Internet. ¡Por favor revise de nuevo!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"buy_part\",\n" +
//                "    \"Vietnam value\": \"MUA LẺ\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"buy_package_2\",\n" +
//                "    \"Vietnam value\": \"Mua gói\",\n" +
//                "    \"English value\": \"Buy package\",\n" +
//                "    \"Peru value\": \"Comprar paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"button_login\",\n" +
//                "    \"Vietnam value\": \"ĐĂNG NHẬP\",\n" +
//                "    \"English value\": \"LOG IN\",\n" +
//                "    \"Peru value\": \"INICIAR SESIÓN\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_login\",\n" +
//                "    \"Vietnam value\": \"Đăng nhập\",\n" +
//                "    \"English value\": \"Log in\",\n" +
//                "    \"Peru value\": \"Iniciar sesión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_login_required\",\n" +
//                "    \"Vietnam value\": \"Khách hàng chưa đăng nhập\",\n" +
//                "    \"English value\": \"Customer is not logged in\",\n" +
//                "    \"Peru value\": \"El cliente no ha iniciado sesión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_share\",\n" +
//                "    \"Vietnam value\": \"Chia sẻ\",\n" +
//                "    \"English value\": \"Share\",\n" +
//                "    \"Peru value\": \"Compartir\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"permisson_explain\",\n" +
//                "    \"Vietnam value\": \"Hãy cho phép truy cập bộ nhớ thiết bị,  máy ảnh để thực hiện chức năng này!\",\n" +
//                "    \"English value\": \"Please allow access to device and camera memory to perform this function!\",\n" +
//                "    \"Peru value\": \"¡Permita el acceso a la memoria del dispositivo y de la cámara para realizar esta función!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"no_data\",\n" +
//                "    \"Vietnam value\": \"Không có dữ liệu.\",\n" +
//                "    \"English value\": \"No data.\",\n" +
//                "    \"Peru value\": \"Sin datos.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_api_error\",\n" +
//                "    \"Vietnam value\": \"Không kết nối được dịch vụ. Vui lòng kiểm tra kết nối mạng và thử lại.\",\n" +
//                "    \"English value\": \"Unable to connect to service. Please check your network connection and try again.\",\n" +
//                "    \"Peru value\": \"No se puede conectar al servicio. Verifique su conexión de red y vuelva a intentarlo.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_server_error\",\n" +
//                "    \"Vietnam value\": \"Hệ thống hiện đang bận. Vui lòng thử lại sau.\",\n" +
//                "    \"English value\": \"The system is currently busy. Please try again later.\",\n" +
//                "    \"Peru value\": \"El sistema se encuentra ocupado. Por favor, inténtelo de nuevo más tarde.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_content_error\",\n" +
//                "    \"Vietnam value\": \"Nội dung lỗi\",\n" +
//                "    \"English value\": \"Error content\",\n" +
//                "    \"Peru value\": \"Error de contenido\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"chia_se\",\n" +
//                "    \"Vietnam value\": \"Chia sẻ\",\n" +
//                "    \"English value\": \"Share\",\n" +
//                "    \"Peru value\": \"Compartir\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"cancel_v2\",\n" +
//                "    \"Vietnam value\": \"Hủy bỏ\",\n" +
//                "    \"English value\": \"Cancel\",\n" +
//                "    \"Peru value\": \"Cancelar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_alert\",\n" +
//                "    \"Vietnam value\": \"Thông báo\",\n" +
//                "    \"English value\": \"Notify\",\n" +
//                "    \"Peru value\": \"Notificar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"default_time_mm_ss\",\n" +
//                "    \"Vietnam value\": \"00:00\",\n" +
//                "    \"English value\": \"00:00\",\n" +
//                "    \"Peru value\": \"00:00\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"label_live\",\n" +
//                "    \"Vietnam value\": \"Trực tiếp\",\n" +
//                "    \"English value\": \"Direct\",\n" +
//                "    \"Peru value\": \"Directo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"back\",\n" +
//                "    \"Vietnam value\": \"Quay lại\",\n" +
//                "    \"English value\": \"Come back\",\n" +
//                "    \"Peru value\": \"Regresar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"register_button\",\n" +
//                "    \"Vietnam value\": \"ĐĂNG KÝ\",\n" +
//                "    \"English value\": \"REGISTER\",\n" +
//                "    \"Peru value\": \"REGISTRARSE\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"buy_all_parts\",\n" +
//                "    \"Vietnam value\": \"MUA TRỌN BỘ\",\n" +
//                "    \"English value\": \"BUY FULL SET\",\n" +
//                "    \"Peru value\": \"COMPRAR JUEGO COMPLETO\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"buy_retail\",\n" +
//                "    \"Vietnam value\": \"MUA LẺ\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"app_id\",\n" +
//                "    \"Vietnam value\": \"BC58840A\",\n" +
//                "    \"English value\": \"BC58840A\",\n" +
//                "    \"Peru value\": \"BC58840A\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"media_route_menu_title\",\n" +
//                "    \"Vietnam value\": \"<![CDATA[Play on&#8230;]]>\",\n" +
//                "    \"English value\": \"<![CDATA[Play on&#8230;]]>\",\n" +
//                "    \"Peru value\": \"<![CDATA[Reproducir en&#8230;]]>\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"next\",\n" +
//                "    \"Vietnam value\": \"Xem tiếp\",\n" +
//                "    \"English value\": \"See more\",\n" +
//                "    \"Peru value\": \"Ver más\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"copied\",\n" +
//                "    \"Vietnam value\": \"Đã sao chép\",\n" +
//                "    \"English value\": \"Copied\",\n" +
//                "    \"Peru value\": \"Copiado\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"success\",\n" +
//                "    \"Vietnam value\": \"Thành công\",\n" +
//                "    \"English value\": \"Successful\",\n" +
//                "    \"Peru value\": \"Exitoso\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"keyword_length_require\",\n" +
//                "    \"Vietnam value\": \"Từ khóa tìm kiếm phải có ít nhất 3 kí tự!\",\n" +
//                "    \"English value\": \"Search keywords must be at least 3 characters!\",\n" +
//                "    \"Peru value\": \"¡Las palabras clave de búsqueda deben tener al menos 3 caracteres!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"casting_not_permit\",\n" +
//                "    \"Vietnam value\": \"Nội dung này không được phép chiếu trên màn hình lớn. Vui lòng dừng chế độ phản chiếu màn hình để tiếp tục xem.\",\n" +
//                "    \"English value\": \"This content is not allowed on the big screen. Please stop screen mirroring to continue viewing.\",\n" +
//                "    \"Peru value\": \"Este contenido no está permitido en la pantalla grande. Detenga la duplicación de pantalla para continuar viendo.\",\n" +
//                "    \"Scenario Vietnam\": \"Thông báo lỗi khi người dùng có hành vi casting/paring từ điện thoại lên màn hình lớn (tivi) đối với những nội dung chỉ cho phép xem trên điện thoại\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"device_not_support\",\n" +
//                "    \"Vietnam value\": \"Nội dung không hỗ trợ xem trên thiết bị này (\",\n" +
//                "    \"English value\": \"Content is not available for viewing on this device (\",\n" +
//                "    \"Peru value\": \"El contenido no está disponible para ver en este dispositivo (\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_play\",\n" +
//                "    \"Vietnam value\": \"Tự động phát\",\n" +
//                "    \"English value\": \"Autoplay\",\n" +
//                "    \"Peru value\": \"Auto-reproducción\",\n" +
//                "    \"Scenario Vietnam\": \"Chức năng tự động phát nội dung\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"download\",\n" +
//                "    \"Vietnam value\": \"Tải về\",\n" +
//                "    \"English value\": \"Download\",\n" +
//                "    \"Peru value\": \"Descargar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"write_a_feedback_reject\",\n" +
//                "    \"Vietnam value\": \"Nội dung ý kiến ...\",\n" +
//                "    \"English value\": \"Content comments...\",\n" +
//                "    \"Peru value\": \"Comentarios del contenido...\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"maybe_you_like\",\n" +
//                "    \"Vietnam value\": \"Có thể bạn thích\",\n" +
//                "    \"English value\": \"Maybe you like\",\n" +
//                "    \"Peru value\": \"Tal vez te gusta\",\n" +
//                "    \"Scenario Vietnam\": \"Gợi ý về nội dung (video, film, live) mà người dùng có thể quan tâm\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"v2_btn_follow_title\",\n" +
//                "    \"Vietnam value\": \"Theo dõi\",\n" +
//                "    \"English value\": \"Follow\",\n" +
//                "    \"Peru value\": \"Seguir\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_follow_lower\",\n" +
//                "    \"Vietnam value\": \"\\\\u0020lượt theo dõi\",\n" +
//                "    \"English value\": \"\\\\u0020follows\",\n" +
//                "    \"Peru value\": \"\\\\u0020sigue\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"registed_up\",\n" +
//                "    \"Vietnam value\": \"ĐÃ ĐĂNG KÝ\",\n" +
//                "    \"English value\": \"REGISTERED\",\n" +
//                "    \"Peru value\": \"REGISTRADO\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"no_network_connected\",\n" +
//                "    \"Vietnam value\": \"Không có kết nối mạng,  vui lòng kiểm tra và thử lại!\",\n" +
//                "    \"English value\": \"No network connection, please check and try again!\",\n" +
//                "    \"Peru value\": \"No hay conexión de red, verifique e intente nuevamente.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"link_account\",\n" +
//                "    \"Vietnam value\": \"Liên kết tài khoản\",\n" +
//                "    \"English value\": \"Account link\",\n" +
//                "    \"Peru value\": \"Enlace de cuenta\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"put_phone_number\",\n" +
//                "    \"Vietnam value\": \"Nhập số điện thoại\",\n" +
//                "    \"English value\": \"Enter your phone number\",\n" +
//                "    \"Peru value\": \"Ingrese su número telefónico\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"put_otp\",\n" +
//                "    \"Vietnam value\": \"Nhập mã OTP\",\n" +
//                "    \"English value\": \"Enter OTP\",\n" +
//                "    \"Peru value\": \"Ingresar OTP\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"get_otp\",\n" +
//                "    \"Vietnam value\": \"Lấy mã OTP\",\n" +
//                "    \"English value\": \"Get OTP\",\n" +
//                "    \"Peru value\": \"Obtener OTP\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_mapping_account\",\n" +
//                "    \"Vietnam value\": \"Liên kết tài khoản\",\n" +
//                "    \"English value\": \"Account link\",\n" +
//                "    \"Peru value\": \"Enlace de cuenta\",\n" +
//                "    \"Scenario Vietnam\": \"Khi đã đăng nhập bằng tài khoản Google/Facebook, người dùng bắt buộc phải liên kết tài khoản với số điện thoại để có thể sử dụng một số nội dung trên ứng dụng\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"message_error_phoneRequired\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập số điện thoại\",\n" +
//                "    \"English value\": \"Please enter the phone number\",\n" +
//                "    \"Peru value\": \"Por favor ingrese el número de teléfono\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"message_error_otpRequired\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập mã OTP\",\n" +
//                "    \"English value\": \"Please enter OTP\",\n" +
//                "    \"Peru value\": \"Por favor ingrese OTP\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"message_error_invalidPhone\",\n" +
//                "    \"Vietnam value\": \"Số điện thoại không hợp lệ. Vui lòng kiểm tra lại\",\n" +
//                "    \"English value\": \"Invalid phone number. Please check again\",\n" +
//                "    \"Peru value\": \"Numero de telefono invalido. Por favor revise de nuevo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"message_sucess\",\n" +
//                "    \"Vietnam value\": \"Thành công\",\n" +
//                "    \"English value\": \"Successful\",\n" +
//                "    \"Peru value\": \"Exitoso\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"error_cant_report_now\",\n" +
//                "    \"Vietnam value\": \"Hiện không thể gửi Báo cáo bây giờ. Vui lòng thử lại sau\",\n" +
//                "    \"English value\": \"It is not possible to submit Reports now. Please try again later\",\n" +
//                "    \"Peru value\": \"No es posible enviar el reporte ahora. Por favor, inténtelo de nuevo más tarde\",\n" +
//                "    \"Scenario Vietnam\": \"Thông báo lỗi khi gửi thông tin báo cáo phản ánh lỗi chất lượng dịch vụ\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"send_report_successful\",\n" +
//                "    \"Vietnam value\": \"Cảm ơn quý khách đã thông báo lỗi\",\n" +
//                "    \"English value\": \"Thank you for reporting the error\",\n" +
//                "    \"Peru value\": \"Gracias por reportar el error\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"buy_package\",\n" +
//                "    \"Vietnam value\": \"Đăng ký %s\",\n" +
//                "    \"English value\": \"Register %s\",\n" +
//                "    \"Peru value\": \"Registrar %s\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"months_before\",\n" +
//                "    \"Vietnam value\": \"tháng trước\",\n" +
//                "    \"English value\": \"last month\",\n" +
//                "    \"Peru value\": \"El mes pasado\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"days_before\",\n" +
//                "    \"Vietnam value\": \"ngày trước\",\n" +
//                "    \"English value\": \"yesterday\",\n" +
//                "    \"Peru value\": \"Ayer\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"hours_before\",\n" +
//                "    \"Vietnam value\": \"giờ trước\",\n" +
//                "    \"English value\": \"hours ago\",\n" +
//                "    \"Peru value\": \"Hace unas horas\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"minutes_before\",\n" +
//                "    \"Vietnam value\": \"phút trước\",\n" +
//                "    \"English value\": \"minute ago\",\n" +
//                "    \"Peru value\": \"Hace unos minutos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"seconds\",\n" +
//                "    \"Vietnam value\": \"giây\",\n" +
//                "    \"English value\": \"second\",\n" +
//                "    \"Peru value\": \"Segundos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"minutes\",\n" +
//                "    \"Vietnam value\": \"phút\",\n" +
//                "    \"English value\": \"minute\",\n" +
//                "    \"Peru value\": \"Minutos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"hour\",\n" +
//                "    \"Vietnam value\": \"giờ\",\n" +
//                "    \"English value\": \"hours\",\n" +
//                "    \"Peru value\": \"Horas\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"days\",\n" +
//                "    \"Vietnam value\": \"ngày\",\n" +
//                "    \"English value\": \"days\",\n" +
//                "    \"Peru value\": \"Días\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"weeks\",\n" +
//                "    \"Vietnam value\": \"tuần\",\n" +
//                "    \"English value\": \"weeks\",\n" +
//                "    \"Peru value\": \"Semanas\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"months\",\n" +
//                "    \"Vietnam value\": \"tháng\",\n" +
//                "    \"English value\": \"months\",\n" +
//                "    \"Peru value\": \"Meses\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"years\",\n" +
//                "    \"Vietnam value\": \"năm\",\n" +
//                "    \"English value\": \"years\",\n" +
//                "    \"Peru value\": \"Años\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"just_now\",\n" +
//                "    \"Vietnam value\": \"Vừa xong\",\n" +
//                "    \"English value\": \"Now\",\n" +
//                "    \"Peru value\": \"Ahora\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_hello\",\n" +
//                "    \"Vietnam value\": \"Xin chào\",\n" +
//                "    \"English value\": \"Hello\",\n" +
//                "    \"Peru value\": \"Hola\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_quality\",\n" +
//                "    \"Vietnam value\": \"Chọn chất lượng\",\n" +
//                "    \"English value\": \"Choose quality\",\n" +
//                "    \"Peru value\": \"Elegir calidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"send\",\n" +
//                "    \"Vietnam value\": \"GỬI\",\n" +
//                "    \"English value\": \"SEND\",\n" +
//                "    \"Peru value\": \"Enviar mensaje\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"setting_menu_quality\",\n" +
//                "    \"Vietnam value\": \"Chọn chất lượng\",\n" +
//                "    \"English value\": \"Choose quality\",\n" +
//                "    \"Peru value\": \"Elegir calidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_player_quality\",\n" +
//                "    \"Vietnam value\": \"Chất lượng\",\n" +
//                "    \"English value\": \"Quality\",\n" +
//                "    \"Peru value\": \"Calidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_player_speed\",\n" +
//                "    \"Vietnam value\": \"Tốc độ phát lại\",\n" +
//                "    \"English value\": \"Playback speed\",\n" +
//                "    \"Peru value\": \"Velocidad de reproducción\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_player_report\",\n" +
//                "    \"Vietnam value\": \"BÁO CÁO\",\n" +
//                "    \"English value\": \"REPORT\",\n" +
//                "    \"Peru value\": \"REPORTAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_player_retry\",\n" +
//                "    \"Vietnam value\": \"THỬ LẠI\",\n" +
//                "    \"English value\": \"RETRY\",\n" +
//                "    \"Peru value\": \"Reintentar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"update\",\n" +
//                "    \"Vietnam value\": \"Chỉnh sửa\",\n" +
//                "    \"English value\": \"Edit\",\n" +
//                "    \"Peru value\": \"Editar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"delete\",\n" +
//                "    \"Vietnam value\": \"Xóa\",\n" +
//                "    \"English value\": \"Erase\",\n" +
//                "    \"Peru value\": \"Borrar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"add_reply\",\n" +
//                "    \"Vietnam value\": \"Thêm bình luận...\",\n" +
//                "    \"English value\": \"More comments...\",\n" +
//                "    \"Peru value\": \"Más comentarios...\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_live\",\n" +
//                "    \"Vietnam value\": \"TRỰC TIẾP\",\n" +
//                "    \"English value\": \"LIVE\",\n" +
//                "    \"Peru value\": \"DIRECTO\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"like\",\n" +
//                "    \"Vietnam value\": \"Thích\",\n" +
//                "    \"English value\": \"Likes\",\n" +
//                "    \"Peru value\": \"Preferir\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"btn_comment\",\n" +
//                "    \"Vietnam value\": \"Bình luận\",\n" +
//                "    \"English value\": \"Comment\",\n" +
//                "    \"Peru value\": \"Comentario\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_sheet_comment\",\n" +
//                "    \"Vietnam value\": \"Bình luận\",\n" +
//                "    \"English value\": \"Comment\",\n" +
//                "    \"Peru value\": \"Comentario\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_sheet_description\",\n" +
//                "    \"Vietnam value\": \"Nội dung mô tả\",\n" +
//                "    \"English value\": \"Description content\",\n" +
//                "    \"Peru value\": \"Descripción\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_sheet_donate\",\n" +
//                "    \"Vietnam value\": \"Ủng hộ\",\n" +
//                "    \"English value\": \"Support\",\n" +
//                "    \"Peru value\": \"Donar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"donate\",\n" +
//                "    \"Vietnam value\": \"Tặng quà\",\n" +
//                "    \"English value\": \"Give a gift\",\n" +
//                "    \"Peru value\": \"Dar un regalo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"continue_watching\",\n" +
//                "    \"Vietnam value\": \"XEM NGAY\",\n" +
//                "    \"English value\": \"WATCH NOW\",\n" +
//                "    \"Peru value\": \"VER AHORA\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"downloadable\",\n" +
//                "    \"Vietnam value\": \"Phim có thể tải về\",\n" +
//                "    \"English value\": \"Downloadable movies\",\n" +
//                "    \"Peru value\": \"Películas descargables\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"finish\",\n" +
//                "    \"Vietnam value\": \"Xong\",\n" +
//                "    \"English value\": \"Done\",\n" +
//                "    \"Peru value\": \"Terminado\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"episode\",\n" +
//                "    \"Vietnam value\": \"CÁC TẬP\",\n" +
//                "    \"English value\": \"EPISODE\",\n" +
//                "    \"Peru value\": \"EPISODIO\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"related\",\n" +
//                "    \"Vietnam value\": \"TƯƠNG TỰ\",\n" +
//                "    \"English value\": \"SIMILAR\",\n" +
//                "    \"Peru value\": \"SIMILAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"comment\",\n" +
//                "    \"Vietnam value\": \"BÌNH LUẬN\",\n" +
//                "    \"English value\": \"COMMENT\",\n" +
//                "    \"Peru value\": \"COMENTAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_title\",\n" +
//                "    \"Vietnam value\": \"Xác nhận\",\n" +
//                "    \"English value\": \"Confirm\",\n" +
//                "    \"Peru value\": \"Confirmar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_title2\",\n" +
//                "    \"Vietnam value\": \"Xác nhận Thanh Toán\",\n" +
//                "    \"English value\": \"Payment confirmation\",\n" +
//                "    \"Peru value\": \"Confirmación de pago\",\n" +
//                "    \"Scenario Vietnam\": \"Khi mua một nội dung hoặc một gói cước nào đó, người dùng sẽ được hỏi xác nhận một lần nữa trước khi thanh toán\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"msg_search_no_result_txt\",\n" +
//                "    \"Vietnam value\": \"Không tìm thấy kết quả nào\",\n" +
//                "    \"English value\": \"No result is found\",\n" +
//                "    \"Peru value\": \"No se encuentra ningún resultado\",\n" +
//                "    \"Scenario Vietnam\": \"Thông báo hiển thị khi người dùng tìm kiếm một nội dung nhưng không có kết quả nào\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"search_txt_hint_input\",\n" +
//                "    \"Vietnam value\": \"Nhập tìm kiếm của bạn tại đây\",\n" +
//                "    \"English value\": \"Enter your search here\",\n" +
//                "    \"Peru value\": \"Introduzca su búsqueda aquí\",\n" +
//                "    \"Scenario Vietnam\": \"Thông tin hiển thị trên ô nhập tìm kiếm một nội dung nào đó\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"voice_search_placeholder\",\n" +
//                "    \"Vietnam value\": \"Bắt đầu nói…\",\n" +
//                "    \"English value\": \"Start talking…\",\n" +
//                "    \"Peru value\": \"Empieza a hablar…\",\n" +
//                "    \"Scenario Vietnam\": \"Thông báo hiển thị khi người dùng sử dụng tính năng tìm kiếm bằng giọng nói\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"general_error_message\",\n" +
//                "    \"Vietnam value\": \"Hệ thống đang bận,  vui lòng thử lại sau!\",\n" +
//                "    \"English value\": \"The system is busy, please try again later!\",\n" +
//                "    \"Peru value\": \"El sistema está ocupado, inténtalo más tarde.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_facebook_error_message\",\n" +
//                "    \"Vietnam value\": \"Thiết bị chưa cài đặt ứng dụng Facebook hoặc có lỗi kết nối mạng,  vui lòng kiểm tra và thử lại!\",\n" +
//                "    \"English value\": \"The device does not have the Facebook app installed or there is a network connection error, please check and try again!\",\n" +
//                "    \"Peru value\": \"El dispositivo no tiene instalada la aplicación de Facebook o hay un error de conexión a la red, ¡compruébalo e inténtalo nuevamente!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_input_otp_sendto\",\n" +
//                "    \"Vietnam value\": \"Nhập mã xác thực OTP gửi đến số:\",\n" +
//                "    \"English value\": \"Enter the OTP verification code sent to the number:\",\n" +
//                "    \"Peru value\": \"Ingrese el código de verificación OTP enviado al número:\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_input_password\",\n" +
//                "    \"Vietnam value\": \"Nhập mật khẩu\",\n" +
//                "    \"English value\": \"Enter password\",\n" +
//                "    \"Peru value\": \"Ingrese la contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_resend_otp\",\n" +
//                "    \"Vietnam value\": \"Gửi lại mã OTP\",\n" +
//                "    \"English value\": \"Resend OTP\",\n" +
//                "    \"Peru value\": \"Reenviar OTP\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_forgot_password\",\n" +
//                "    \"Vietnam value\": \"Quên mật khẩu\",\n" +
//                "    \"English value\": \"Forgot password\",\n" +
//                "    \"Peru value\": \"Olvidé la  contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_get_password\",\n" +
//                "    \"Vietnam value\": \"Lấy mật khẩu\",\n" +
//                "    \"English value\": \"Get password\",\n" +
//                "    \"Peru value\": \"Obtener la contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_wrong_otp\",\n" +
//                "    \"Vietnam value\": \"Bạn đã nhập sai quá 5 lần\",\n" +
//                "    \"English value\": \"You have entered wrong more than 5 times\",\n" +
//                "    \"Peru value\": \"Lo ingresaste mal más de 5 veces\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"not_understand_voice\",\n" +
//                "    \"Vietnam value\": \"Không hiểu được thông tin\",\n" +
//                "    \"English value\": \"Can't understand the information\",\n" +
//                "    \"Peru value\": \"No puedo entender la información.\",\n" +
//                "    \"Scenario Vietnam\": \"Thông báo hiển thị khi người dùng sử dụng tính năng tìm kiếm bằng giọng nói tuy nhiên thiết bị không nhận dạng được thông tin\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_qr_code\",\n" +
//                "    \"Vietnam value\": \"Kết nối SmartTV\",\n" +
//                "    \"English value\": \"Connect SmartTV\",\n" +
//                "    \"Peru value\": \"Conectar SmartTV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_favourite\",\n" +
//                "    \"Vietnam value\": \"Yêu thích\",\n" +
//                "    \"English value\": \"Favourite\",\n" +
//                "    \"Peru value\": \"Favorito\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_history\",\n" +
//                "    \"Vietnam value\": \"Lịch sử xem\",\n" +
//                "    \"English value\": \"View history\",\n" +
//                "    \"Peru value\": \"Ver historial\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_term\",\n" +
//                "    \"Vietnam value\": \"Điều khoản sử dụng\",\n" +
//                "    \"English value\": \"terms of use\",\n" +
//                "    \"Peru value\": \"Términos y condiciones\",\n" +
//                "    \"Scenario Vietnam\": \"Điều khoản sử dụng dịch vụ\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_private\",\n" +
//                "    \"Vietnam value\": \"Chính sách bảo mật\",\n" +
//                "    \"English value\": \"Privacy Policy\",\n" +
//                "    \"Peru value\": \"Política de privacidad\",\n" +
//                "    \"Scenario Vietnam\": \"Chính sách bảo mật khi sử dụng dịch vụ\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_support\",\n" +
//                "    \"Vietnam value\": \"Hỗ trợ\",\n" +
//                "    \"English value\": \"Support\",\n" +
//                "    \"Peru value\": \"Ayuda\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_watch_later\",\n" +
//                "    \"Vietnam value\": \"Xem sau\",\n" +
//                "    \"English value\": \"Watch it later\",\n" +
//                "    \"Peru value\": \"Ver más tarde\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_game\",\n" +
//                "    \"Vietnam value\": \"ViettelTV Game\",\n" +
//                "    \"English value\": \"ViettelTV Game\",\n" +
//                "    \"Peru value\": \"Juego ViettelTV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_setting\",\n" +
//                "    \"Vietnam value\": \"Cài đặt\",\n" +
//                "    \"English value\": \"Setting\",\n" +
//                "    \"Peru value\": \"Ajustes\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_refer_intro\",\n" +
//                "    \"Vietnam value\": \"Lan tỏa TV360\",\n" +
//                "    \"English value\": \"Spread TV360\",\n" +
//                "    \"Peru value\": \"Difundir TV360\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_gift\",\n" +
//                "    \"Vietnam value\": \"Nhập mã quà tặng\",\n" +
//                "    \"English value\": \"Enter gift code\",\n" +
//                "    \"Peru value\": \"Introduce el código de regalo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_logout\",\n" +
//                "    \"Vietnam value\": \"Đăng xuất\",\n" +
//                "    \"English value\": \"Log out\",\n" +
//                "    \"Peru value\": \"Cerrar sesión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_retail\",\n" +
//                "    \"Vietnam value\": \"Đã mua lẻ\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_package\",\n" +
//                "    \"Vietnam value\": \"Gói cước\",\n" +
//                "    \"English value\": \"Data package\",\n" +
//                "    \"Peru value\": \"Paquete de datos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_accept\",\n" +
//                "    \"Vietnam value\": \"Đồng ý\",\n" +
//                "    \"English value\": \"Agree\",\n" +
//                "    \"Peru value\": \"Aceptar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_cancel\",\n" +
//                "    \"Vietnam value\": \"Hủy\",\n" +
//                "    \"English value\": \"Cancel\",\n" +
//                "    \"Peru value\": \"Cancelar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"<string name = \\\"policy_title_underline\",\n" +
//                "    \"Vietnam value\": \"Điều khoản sử dụng và Chính sách bảo mật của Viettel\",\n" +
//                "    \"English value\": \"Viettel's Terms of Use and Privacy Policy\",\n" +
//                "    \"Peru value\": \"Términos y condiciones y política de privacidad de Bitel\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"error_occur_retry\",\n" +
//                "    \"Vietnam value\": \"Có lỗi xảy ra,  nhấn để thử lại\",\n" +
//                "    \"English value\": \"An error occurred, press to try again\",\n" +
//                "    \"Peru value\": \"Ocurrió un error, presione para volver a intentarlo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_password_invalid\",\n" +
//                "    \"Vietnam value\": \"Mật khẩu phải từ %d - %d ký tự\",\n" +
//                "    \"English value\": \"Password must be from %d - %d characters\",\n" +
//                "    \"Peru value\": \"La contraseña debe ser de %d - %d caracteres\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_change_password\",\n" +
//                "    \"Vietnam value\": \"Đổi mật khẩu\",\n" +
//                "    \"English value\": \"Change Password\",\n" +
//                "    \"Peru value\": \"Cambiar la contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_drm_info\",\n" +
//                "    \"Vietnam value\": \"Widevine\",\n" +
//                "    \"English value\": \"Widevine\",\n" +
//                "    \"Peru value\": \"Widevine\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_devices_manager\",\n" +
//                "    \"Vietnam value\": \"Quản lý thiết bị\",\n" +
//                "    \"English value\": \"Device Management\",\n" +
//                "    \"Peru value\": \"Gestión de dispositivos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_txt_require_old_pass\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập Mật khẩu cũ (*)\",\n" +
//                "    \"English value\": \"Please enter Old Password (*)\",\n" +
//                "    \"Peru value\": \"Ingrese la contraseña anterior (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_txt_requre_new_pass\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhâp Mật khẩu mới (*)\",\n" +
//                "    \"English value\": \"Please enter New Password (*)\",\n" +
//                "    \"Peru value\": \"Por favor ingrese Nueva Contraseña (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_txt_require_confirm_pass\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập lại Mật khẩu mới (*)\",\n" +
//                "    \"English value\": \"Please re-enter New Password (*)\",\n" +
//                "    \"Peru value\": \"Vuelva a ingresar la nueva contraseña (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_txt_not_match_pass\",\n" +
//                "    \"Vietnam value\": \"Mật khẩu xác nhận không trùng khớp\",\n" +
//                "    \"English value\": \"Confirmation password does not match\",\n" +
//                "    \"Peru value\": \"La contraseña no coincide\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_txt_require_captcha\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập Mã xác nhận\",\n" +
//                "    \"English value\": \"Please enter the Verification Code\",\n" +
//                "    \"Peru value\": \"Porfavor ingrese el codigo de verificación\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_default_error\",\n" +
//                "    \"Vietnam value\": \"Có lỗi xảy ra. Vui lòng thử lại\",\n" +
//                "    \"English value\": \"An error occurred. Please try again\",\n" +
//                "    \"Peru value\": \"Ocurrió un error. Inténtalo de nuevo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_send\",\n" +
//                "    \"Vietnam value\": \"GỬI\",\n" +
//                "    \"English value\": \"TO SEND\",\n" +
//                "    \"Peru value\": \"ENVIAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_login\",\n" +
//                "    \"Vietnam value\": \"Đăng nhập\",\n" +
//                "    \"English value\": \"Log in\",\n" +
//                "    \"Peru value\": \"Iniciar sesión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_confirm_log_out\",\n" +
//                "    \"Vietnam value\": \"Bạn có chắc chắn muốn đăng xuất tài khoản?\",\n" +
//                "    \"English value\": \"Are you sure you want to sign out of your account?\",\n" +
//                "    \"Peru value\": \"¿Estás seguro de que quieres salir de tu cuenta?\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"report_error_text_captcha\",\n" +
//                "    \"Vietnam value\": \"Mã xác nhận\",\n" +
//                "    \"English value\": \"Verification\",\n" +
//                "    \"Peru value\": \"Verificación\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"change_password_text_hint_new_pass\",\n" +
//                "    \"Vietnam value\": \"Nhập mật khẩu mới\",\n" +
//                "    \"English value\": \"Enter your new password\",\n" +
//                "    \"Peru value\": \"Introduzca su nueva contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_auto\",\n" +
//                "    \"Vietnam value\": \"Tự động\",\n" +
//                "    \"English value\": \"Automatic\",\n" +
//                "    \"Peru value\": \"Automático\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_no_result\",\n" +
//                "    \"Vietnam value\": \"Không có dữ liệu\",\n" +
//                "    \"English value\": \"No data\",\n" +
//                "    \"Peru value\": \"Sin datos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"send_message\",\n" +
//                "    \"Vietnam value\": \"GỬI TIN\",\n" +
//                "    \"English value\": \"TO SEND\",\n" +
//                "    \"Peru value\": \"ENVIAR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"text_require_change_password\",\n" +
//                "    \"Vietnam value\": \"Vui lòng đổi mật khẩu ở lần đầu tiên đăng nhập.\",\n" +
//                "    \"English value\": \"Please change your password the first time you log in.\",\n" +
//                "    \"Peru value\": \"Cambie su contraseña la primera vez que inicie sesión.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_quit_app\",\n" +
//                "    \"Vietnam value\": \"Thoát ứng dụng\",\n" +
//                "    \"English value\": \"Exit the app\",\n" +
//                "    \"Peru value\": \"Sal de la aplicación\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"content_quit_app\",\n" +
//                "    \"Vietnam value\": \"Bạn có chắc chắn muốn thoát ứng dụng?\",\n" +
//                "    \"English value\": \"Are you sure you want to exit the application?\",\n" +
//                "    \"Peru value\": \"¿Estás seguro de que quieres salir de la aplicación?\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_login_title\",\n" +
//                "    \"Vietnam value\": \"Đăng nhập\",\n" +
//                "    \"English value\": \"Log in\",\n" +
//                "    \"Peru value\": \"Iniciar sesión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_phone_number\",\n" +
//                "    \"Vietnam value\": \"Nhập số điện thoại/Tài khoản\",\n" +
//                "    \"English value\": \"Enter your phone number/Account\",\n" +
//                "    \"Peru value\": \"Ingrese su número de teléfono/Cuenta\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_password\",\n" +
//                "    \"Vietnam value\": \"Nhập mật khẩu (*)\",\n" +
//                "    \"English value\": \"Enter password (*)\",\n" +
//                "    \"Peru value\": \"Introducir la contraseña (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_input_password\",\n" +
//                "    \"Vietnam value\": \"Nhập lại mật khẩu (*)\",\n" +
//                "    \"English value\": \"Enter the password (*)\",\n" +
//                "    \"Peru value\": \"Introduce la contraseña (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_confirm_password\",\n" +
//                "    \"Vietnam value\": \"Xác nhận mật khẩu mới (*)\",\n" +
//                "    \"English value\": \"Confirm new password (*)\",\n" +
//                "    \"Peru value\": \"Confirmar nueva contraseña (*)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_set_password\",\n" +
//                "    \"Vietnam value\": \"Đặt mật khẩu\",\n" +
//                "    \"English value\": \"Set password\",\n" +
//                "    \"Peru value\": \"Configurar contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_change_password\",\n" +
//                "    \"Vietnam value\": \"Đổi mật khẩu\",\n" +
//                "    \"English value\": \"Change Password\",\n" +
//                "    \"Peru value\": \"Cambiar contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_complete\",\n" +
//                "    \"Vietnam value\": \"Hoàn thành\",\n" +
//                "    \"English value\": \"Complete\",\n" +
//                "    \"Peru value\": \"Completo\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_title_otp\",\n" +
//                "    \"Vietnam value\": \"000 000\",\n" +
//                "    \"English value\": \"000 000\",\n" +
//                "    \"Peru value\": \"000 000\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_continue\",\n" +
//                "    \"Vietnam value\": \"Tiếp tục\",\n" +
//                "    \"English value\": \"Continue\",\n" +
//                "    \"Peru value\": \"Continuar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"watch_txt_guideline\",\n" +
//                "    \"Vietnam value\": \"Xem hướng dẫn\",\n" +
//                "    \"English value\": \"See the instructions\",\n" +
//                "    \"Peru value\": \"Ver las instrucciones\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_or\",\n" +
//                "    \"Vietnam value\": \"Hoặc đăng nhập bằng\",\n" +
//                "    \"English value\": \"Or login with\",\n" +
//                "    \"Peru value\": \"O inicia sesión con\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_login_4g\",\n" +
//                "    \"Vietnam value\": \"Tự động đăng nhập bằng 4G\",\n" +
//                "    \"English value\": \"Automatically log in with 4G\",\n" +
//                "    \"Peru value\": \"Iniciar sesión automáticamente con 4G\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_facebook\",\n" +
//                "    \"Vietnam value\": \"Facebook\",\n" +
//                "    \"English value\": \"Facebook\",\n" +
//                "    \"Peru value\": \"Facebook\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"login_txt_google\",\n" +
//                "    \"Vietnam value\": \"Google\",\n" +
//                "    \"English value\": \"Google\",\n" +
//                "    \"Peru value\": \"Google\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_actor\",\n" +
//                "    \"Vietnam value\": \"Diễn viên:\",\n" +
//                "    \"English value\": \"Cast:\",\n" +
//                "    \"Peru value\": \"Reparto:\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"default_zero\",\n" +
//                "    \"Vietnam value\": 0,\n" +
//                "    \"English value\": 0,\n" +
//                "    \"Peru value\": 0,\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_national\",\n" +
//                "    \"Vietnam value\": \"Quốc gia:\",\n" +
//                "    \"English value\": \"Country:\",\n" +
//                "    \"Peru value\": \"País:\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_part_list\",\n" +
//                "    \"Vietnam value\": \"Danh sách tập\",\n" +
//                "    \"English value\": \"Episode List\",\n" +
//                "    \"Peru value\": \"Lista de episodios\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"related_film\",\n" +
//                "    \"Vietnam value\": \"Phim liên quan\",\n" +
//                "    \"English value\": \"Related movies\",\n" +
//                "    \"Peru value\": \"Películas relacionadas\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"hire_film\",\n" +
//                "    \"Vietnam value\": \"THUÊ PHIM\",\n" +
//                "    \"English value\": \"MOVIE RENTAL\",\n" +
//                "    \"Peru value\": \"ALQUILER DE PELÍCULAS\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"ago\",\n" +
//                "    \"Vietnam value\": \"trước\",\n" +
//                "    \"English value\": \"before\",\n" +
//                "    \"Peru value\": \"antes de\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"quality\",\n" +
//                "    \"Vietnam value\": \"Chất lượng\",\n" +
//                "    \"English value\": \"Quality\",\n" +
//                "    \"Peru value\": \"Calidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"speed\",\n" +
//                "    \"Vietnam value\": \"Tốc độ\",\n" +
//                "    \"English value\": \"Speed\",\n" +
//                "    \"Peru value\": \"Velocidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"report\",\n" +
//                "    \"Vietnam value\": \"Báo cáo\",\n" +
//                "    \"English value\": \"Report\",\n" +
//                "    \"Peru value\": \"Reportar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto\",\n" +
//                "    \"Vietnam value\": \"Tự động\",\n" +
//                "    \"English value\": \"Automatic\",\n" +
//                "    \"Peru value\": \"Automático\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"tv\",\n" +
//                "    \"Vietnam value\": \"Tivi\",\n" +
//                "    \"English value\": \"Television\",\n" +
//                "    \"Peru value\": \"Televisión\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"live_tv\",\n" +
//                "    \"Vietnam value\": \"Truyền hình\",\n" +
//                "    \"English value\": \"TV\",\n" +
//                "    \"Peru value\": \"TV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"old_password_empty\",\n" +
//                "    \"Vietnam value\": \"Bạn phải nhập mật khẩu cũ\",\n" +
//                "    \"English value\": \"You must enter the old password\",\n" +
//                "    \"Peru value\": \"Debes ingresar la contraseña anterior\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"new_password_empty\",\n" +
//                "    \"Vietnam value\": \"Bạn phải nhập mật khẩu mới\",\n" +
//                "    \"English value\": \"You must enter a new password\",\n" +
//                "    \"Peru value\": \"Debes ingresar una nueva contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_new_password_empty\",\n" +
//                "    \"Vietnam value\": \"Bạn phải nhập mật xác nhận khẩu mới\",\n" +
//                "    \"English value\": \"You must enter a new password to confirm your password\",\n" +
//                "    \"Peru value\": \"Debe ingresar una nueva contraseña para confirmar su contraseña\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"password_invalid_length\",\n" +
//                "    \"Vietnam value\": \"Mật khẩu phải từ 6 - 128 ký tự\",\n" +
//                "    \"English value\": \"Password must be between 6 - 128 characters\",\n" +
//                "    \"Peru value\": \"La contraseña debe tener entre 6 y 128 caracteres\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_password_not_match\",\n" +
//                "    \"Vietnam value\": \"Xác nhận mật khẩu không đúng\",\n" +
//                "    \"English value\": \"Password was wrong\",\n" +
//                "    \"Peru value\": \"La contraseña era incorrecta\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"captch_empty\",\n" +
//                "    \"Vietnam value\": \"Bạn phải nhập captcha\",\n" +
//                "    \"English value\": \"You must enter the captcha\",\n" +
//                "    \"Peru value\": \"Debes ingresar el captcha\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"system_busy\",\n" +
//                "    \"Vietnam value\": \"Hệ thống hiện đang bận,  vui lòng thử lại sau.\",\n" +
//                "    \"English value\": \"The system is currently busy, please try again later.\",\n" +
//                "    \"Peru value\": \"El sistema está actualmente ocupado, inténtelo de nuevo más tarde.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_manage_profile\",\n" +
//                "    \"Vietnam value\": \"Quản lý hồ sơ\",\n" +
//                "    \"English value\": \"Profile management\",\n" +
//                "    \"Peru value\": \"Gestión de perfiles\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"save\",\n" +
//                "    \"Vietnam value\": \"Lưu\",\n" +
//                "    \"English value\": \"Save\",\n" +
//                "    \"Peru value\": \"Guardar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"empty\",\n" +
//                "    \"Vietnam value\": \"Trống\",\n" +
//                "    \"English value\": \"Empty\",\n" +
//                "    \"Peru value\": \"Vacío\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"unknown\",\n" +
//                "    \"Vietnam value\": \"Chưa xét\",\n" +
//                "    \"English value\": \"Unknown\",\n" +
//                "    \"Peru value\": \"Desconocido\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"create_profile\",\n" +
//                "    \"Vietnam value\": \"Thêm profile\",\n" +
//                "    \"English value\": \"Add profile\",\n" +
//                "    \"Peru value\": \"Añadir perfil\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"all_age\",\n" +
//                "    \"Vietnam value\": \"Người lớn 18+\",\n" +
//                "    \"English value\": \"Adults 18+\",\n" +
//                "    \"Peru value\": \"Adultos 18+\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"teen_16\",\n" +
//                "    \"Vietnam value\": \"Thiếu niên 16+\",\n" +
//                "    \"English value\": \"Teenager 16+\",\n" +
//                "    \"Peru value\": \"Adolescente 16+\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"children_13\",\n" +
//                "    \"Vietnam value\": \"Trẻ em 13+\",\n" +
//                "    \"English value\": \"Children 13+\",\n" +
//                "    \"Peru value\": \"Niños 13+\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"children_7\",\n" +
//                "    \"Vietnam value\": \"Trẻ em 7+\",\n" +
//                "    \"English value\": \"Children 7+\",\n" +
//                "    \"Peru value\": \"Niños 7+\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"content_filter_18_detail\",\n" +
//                "    \"Vietnam value\": \"Không giới hạn nội dung cho hồ sơ này.\",\n" +
//                "    \"English value\": \"There is no content limit for this profile.\",\n" +
//                "    \"Peru value\": \"No hay límite de contenido para este perfil.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"content_filter_16_detail\",\n" +
//                "    \"Vietnam value\": \"Chỉ hiển thị các video có mức xếp hạng độ tuổi <b> 16+ trở xuống</b> cho hồ sơ này.\",\n" +
//                "    \"English value\": \"Show only videos with an age rating <b> 16+ or below</b> for this profile.\",\n" +
//                "    \"Peru value\": \"Mostrar solo videos con una clasificación de edad <b> 16+ o menor</b> para este perfil.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"content_filter_13_detail\",\n" +
//                "    \"Vietnam value\": \"Chỉ hiển thị các video có mức xếp hạng độ tuổi <b> 13+ trở xuống</b> cho hồ sơ này.\",\n" +
//                "    \"English value\": \"Show only videos with an age rating <b> 13+ or below</b> for this profile.\",\n" +
//                "    \"Peru value\": \"Mostrar solo videos con una clasificación de edad <b> 13+ o menor</b> para este perfil.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"content_filter_7_detail\",\n" +
//                "    \"Vietnam value\": \"Chỉ hiển thị các video có mức xếp hạng độ tuổi <b> 7+ trở xuống</b> cho hồ sơ này.\",\n" +
//                "    \"English value\": \"Only videos with an age rating <b> 7+ or below</b> for this profile will be shown.\",\n" +
//                "    \"Peru value\": \"Solo se mostrarán los videos con una clasificación de edad <b> 7+ o menor</b> para este perfil.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"add\",\n" +
//                "    \"Vietnam value\": \"Thêm\",\n" +
//                "    \"English value\": \"More\",\n" +
//                "    \"Peru value\": \"Más\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_update_profile\",\n" +
//                "    \"Vietnam value\": \"Chỉnh sửa hồ sơ\",\n" +
//                "    \"English value\": \"Edit Profile\",\n" +
//                "    \"Peru value\": \"Editar perfil\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"title_connect_tv\",\n" +
//                "    \"Vietnam value\": \"Nhập Mã Số trên màn hình Tivi,  Web\\\\nhoặc quét QR Code để kết nối tài khoản\",\n" +
//                "    \"English value\": \"Enter the Code on the TV screen, Web\\\\nor scan the QR Code to connect the account\",\n" +
//                "    \"Peru value\": \"Ingrese el Código en la pantalla del televisor, Web\\\\o escanee el Código QR para conectar la cuenta\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"description_connect_tv\",\n" +
//                "    \"Vietnam value\": \"Nhập 6 ký tự số đang hiển thị trên màn Đăng Nhập\\\\ntrên ứng dụng TV360 tại thiết bị SmartTV\",\n" +
//                "    \"English value\": \"Enter the 6 numeric characters displayed on the Login screen\\\\n on the TV360 app at the SmartTV device\",\n" +
//                "    \"Peru value\": \"Ingrese los 6 caracteres numéricos que se muestran en la pantalla de inicio de sesión\\\\n en la aplicación TV360 en el dispositivo SmartTV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"attention_connect_tv\",\n" +
//                "    \"Vietnam value\": \"Hoặc quét và trỏ camera vào mã QR Code\",\n" +
//                "    \"English value\": \"Or scan and point the camera at the QR Code\",\n" +
//                "    \"Peru value\": \"O escanee y apunte la cámara al código QR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"button_qr_code\",\n" +
//                "    \"Vietnam value\": \"Quét QR Code\",\n" +
//                "    \"English value\": \"Scan QR Code\",\n" +
//                "    \"Peru value\": \"Escanear código QR\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"error_message_input_code\",\n" +
//                "    \"Vietnam value\": \"Nhập mã sai\",\n" +
//                "    \"English value\": \"Enter the wrong code\",\n" +
//                "    \"Peru value\": \"Ingresó el código incorrecto\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"error_message_otp_connect_tv\",\n" +
//                "    \"Vietnam value\": \"Mã OTP không hợp lệ\",\n" +
//                "    \"English value\": \"Invalid OTP code\",\n" +
//                "    \"Peru value\": \"Código OTP no válido\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"list_favourite\",\n" +
//                "    \"Vietnam value\": \"Danh sách yêu thích\",\n" +
//                "    \"English value\": \"Favorites List\",\n" +
//                "    \"Peru value\": \"Lista de favoritos\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"account_menu_policy_security\",\n" +
//                "    \"Vietnam value\": \"Chính sách bảo mật\",\n" +
//                "    \"English value\": \"Privacy Policy\",\n" +
//                "    \"Peru value\": \"Política de privacidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"support_switchboard\",\n" +
//                "    \"Vietnam value\": \"Tổng đài hỗ trợ\",\n" +
//                "    \"English value\": \"Support call center\",\n" +
//                "    \"Peru value\": \"Soporte de Call Center\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"contact_switchboard\",\n" +
//                "    \"Vietnam value\": \"Liên hệ 24/7 tổng đài 18008098\",\n" +
//                "    \"English value\": \"Contact call center 0800 79123\",\n" +
//                "    \"Peru value\": \"Póngase en contacto con el centro al cliente 0800 79123\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"call_now\",\n" +
//                "    \"Vietnam value\": \"Gọi ngay\",\n" +
//                "    \"English value\": \"Call now\",\n" +
//                "    \"Peru value\": \"Llama ahora\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"connect_with_tv\",\n" +
//                "    \"Vietnam value\": \"Kết nối SmartTV\",\n" +
//                "    \"English value\": \"Connect SmartTV\",\n" +
//                "    \"Peru value\": \"Conectar SmartTV\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"please_input_name\",\n" +
//                "    \"Vietnam value\": \"Vui lòng nhập tên!\",\n" +
//                "    \"English value\": \"Please enter a name!\",\n" +
//                "    \"Peru value\": \"¡Por favor ingrese un nombre!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_total\",\n" +
//                "    \"Vietnam value\": \"Tổng cộng\",\n" +
//                "    \"English value\": \"total\",\n" +
//                "    \"Peru value\": \"total\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_expire_date\",\n" +
//                "    \"Vietnam value\": \"Ngày hết hạn\",\n" +
//                "    \"English value\": \"Expiration date\",\n" +
//                "    \"Peru value\": \"Fecha de caducidad\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_username\",\n" +
//                "    \"Vietnam value\": \"Tài khoản\",\n" +
//                "    \"English value\": \"Account\",\n" +
//                "    \"Peru value\": \"Cuenta\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"continue_watching_video\",\n" +
//                "    \"Vietnam value\": \"Tiếp Tục Xem Chương Trình\",\n" +
//                "    \"English value\": \"Continue Watching Programs\",\n" +
//                "    \"Peru value\": \"Continuar viendo programas\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"go_home\",\n" +
//                "    \"Vietnam value\": \"Trở Về Trang Chủ\",\n" +
//                "    \"English value\": \"Back to Homepage\",\n" +
//                "    \"Peru value\": \"Volver a la página de inicio\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"purchased_message\",\n" +
//                "    \"Vietnam value\": \"Bạn đã thanh toán thành công số tiền\",\n" +
//                "    \"English value\": \"You have successfully paid the amount\",\n" +
//                "    \"Peru value\": \"Has pagado correctamente el importe\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"no_package_group_message\",\n" +
//                "    \"Vietnam value\": \"Không có dữ liệu gói cước!\",\n" +
//                "    \"English value\": \"No data plan!\",\n" +
//                "    \"Peru value\": \"¡Sin plan de datos!\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"make_payment_text_button\",\n" +
//                "    \"Vietnam value\": \"Thanh Toán\",\n" +
//                "    \"English value\": \"Pay\",\n" +
//                "    \"Peru value\": \"Pagar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"make_payment\",\n" +
//                "    \"Vietnam value\": \"Thanh toán\",\n" +
//                "    \"English value\": \"Pay\",\n" +
//                "    \"Peru value\": \"Pagar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"cancel_package_used\",\n" +
//                "    \"Vietnam value\": \"Hủy Gói Cước\",\n" +
//                "    \"English value\": \"Cancel Package\",\n" +
//                "    \"Peru value\": \"Cancelar paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"restore_package\",\n" +
//                "    \"Vietnam value\": \"Khôi Phục Gói Cước\",\n" +
//                "    \"English value\": \"Package Recovery\",\n" +
//                "    \"Peru value\": \"Recuperación de paquetes\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"minimize\",\n" +
//                "    \"Vietnam value\": \"Thu gọn\",\n" +
//                "    \"English value\": \"Collapse\",\n" +
//                "    \"Peru value\": \"Colapsar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"see_more\",\n" +
//                "    \"Vietnam value\": \"Xem thêm\",\n" +
//                "    \"English value\": \"see more\",\n" +
//                "    \"Peru value\": \"ver más\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"disconnected_from_billing_service\",\n" +
//                "    \"Vietnam value\": \"Bạn đang không kết nối đến dịch vụ thanh toán\",\n" +
//                "    \"English value\": \"You are not connected to the payment service\",\n" +
//                "    \"Peru value\": \"No estás conectado al servicio de pago\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"no_skudetail_list\",\n" +
//                "    \"Vietnam value\": \"Không có gói để thanh toán\",\n" +
//                "    \"English value\": \"There is no package to pay\",\n" +
//                "    \"Peru value\": \"No hay paquete para pagar\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"billing_client_not_ready\",\n" +
//                "    \"Vietnam value\": \"Dịch vụ thanh toán chưa sẵn sàng\",\n" +
//                "    \"English value\": \"Payment service not ready\",\n" +
//                "    \"Peru value\": \"El servicio de pago no está listo\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"purchase_list_empty\",\n" +
//                "    \"Vietnam value\": \"Thanh toán không thành công\",\n" +
//                "    \"English value\": \"Payment failed\",\n" +
//                "    \"Peru value\": \"Pago fallido\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"billing_unavailable\",\n" +
//                "    \"Vietnam value\": \"Dịch vụ thanh toán không khả dụng\",\n" +
//                "    \"English value\": \"Payment service not available\",\n" +
//                "    \"Peru value\": \"Servicio de pago no disponible\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"developer_error\",\n" +
//                "    \"Vietnam value\": \"Vui lòng cấu hình tài khoản để thanh toán được\",\n" +
//                "    \"English value\": \"Please configure your account to be able to pay\",\n" +
//                "    \"Peru value\": \"Por favor configure su cuenta para poder pagar\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"feature_not_supported\",\n" +
//                "    \"Vietnam value\": \"Tính năng không được hỗ trợ\",\n" +
//                "    \"English value\": \"Unsupported feature\",\n" +
//                "    \"Peru value\": \"Función no admitida\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"item_already_owned\",\n" +
//                "    \"Vietnam value\": \"Quý khách đã đăng ký gói cước trước đó\",\n" +
//                "    \"English value\": \"You have registered the package before\",\n" +
//                "    \"Peru value\": \"Has registrado el paquete anteriormente\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"service_unavailable\",\n" +
//                "    \"Vietnam value\": \"Dịch vụ thanh toán không khả thi\",\n" +
//                "    \"English value\": \"Payment service not possible\",\n" +
//                "    \"Peru value\": \"Servicio de pago no disponible\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"service_disconnected\",\n" +
//                "    \"Vietnam value\": \"Dịch vụ thanh toán bị ngắt kết nối\",\n" +
//                "    \"English value\": \"Payment service disconnected\",\n" +
//                "    \"Peru value\": \"Servicio de pago desconectado\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"service_timeout\",\n" +
//                "    \"Vietnam value\": \"Dịch vụ thanh toán bị ngắt kết nối\",\n" +
//                "    \"English value\": \"Payment service disconnected\",\n" +
//                "    \"Peru value\": \"Servicio de pago desconectado\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"item_unavailable\",\n" +
//                "    \"Vietnam value\": \"Gói cước không khả dụng\",\n" +
//                "    \"English value\": \"Package is not available\",\n" +
//                "    \"Peru value\": \"El paquete no está disponible\",\n" +
//                "    \"Scenario Vietnam\": \"thông báo lỗi khi người dùng sử dụng tính năng GooglePay\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_method_sms\",\n" +
//                "    \"Vietnam value\": \"Tài khoản điện thoại\",\n" +
//                "    \"English value\": \"Mobile account\",\n" +
//                "    \"Peru value\": \"cuenta móvil\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_method_the\",\n" +
//                "    \"Vietnam value\": \"Thẻ cào\",\n" +
//                "    \"English value\": \"Scratch cards\",\n" +
//                "    \"Peru value\": \"Tarjetas de raspar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_method_visa\",\n" +
//                "    \"Vietnam value\": \"Visa, Master\",\n" +
//                "    \"English value\": \"Visa, Master\",\n" +
//                "    \"Peru value\": \"Visa, Master\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_payment_method_google\",\n" +
//                "    \"Vietnam value\": \"Google Payment\",\n" +
//                "    \"English value\": \"Google Payment\",\n" +
//                "    \"Peru value\": \"Pago con Google\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"learn_more\",\n" +
//                "    \"Vietnam value\": \"Tìm hiểu thêm\",\n" +
//                "    \"English value\": \"looking for more information\",\n" +
//                "    \"Peru value\": \"buscando más información\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"item_not_owned\",\n" +
//                "    \"Vietnam value\": \"Không sở hữu được gói cước\",\n" +
//                "    \"English value\": \"Can't own a package\",\n" +
//                "    \"Peru value\": \"No puede obtener el paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_used\",\n" +
//                "    \"Vietnam value\": \"Đang sử dụng\",\n" +
//                "    \"English value\": \"Using\",\n" +
//                "    \"Peru value\": \"Usando\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_type\",\n" +
//                "    \"Vietnam value\": \"Loại gói cước\",\n" +
//                "    \"English value\": \"Package Type\",\n" +
//                "    \"Peru value\": \"Tipo de paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"payment_method\",\n" +
//                "    \"Vietnam value\": \"Phương thức thanh toán\",\n" +
//                "    \"English value\": \"Payment methods\",\n" +
//                "    \"Peru value\": \"Métodos de pago\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"selecting_package\",\n" +
//                "    \"Vietnam value\": \"Chọn gói\",\n" +
//                "    \"English value\": \"Choose package\",\n" +
//                "    \"Peru value\": \"Elegir paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"result\",\n" +
//                "    \"Vietnam value\": \"Kết quả\",\n" +
//                "    \"English value\": \"Result\",\n" +
//                "    \"Peru value\": \"Resultado\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"_3\",\n" +
//                "    \"Vietnam value\": 3,\n" +
//                "    \"English value\": 3,\n" +
//                "    \"Peru value\": 3,\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"_2\",\n" +
//                "    \"Vietnam value\": 2,\n" +
//                "    \"English value\": 2,\n" +
//                "    \"Peru value\": 2,\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"_1\",\n" +
//                "    \"Vietnam value\": 1,\n" +
//                "    \"English value\": 1,\n" +
//                "    \"Peru value\": 1,\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"discount_code\",\n" +
//                "    \"Vietnam value\": \"Mã khuyến mại\",\n" +
//                "    \"English value\": \"Promotional code\",\n" +
//                "    \"Peru value\": \"Codigo promocional\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"viettel_voucher\",\n" +
//                "    \"Vietnam value\": \"Viettel Voucher\",\n" +
//                "    \"English value\": \"Bitel Voucher\",\n" +
//                "    \"Peru value\": \"Vale Bitel\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"close_camelcase\",\n" +
//                "    \"Vietnam value\": \"Đóng\",\n" +
//                "    \"English value\": \"Close\",\n" +
//                "    \"Peru value\": \"Cerrar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"total_price\",\n" +
//                "    \"Vietnam value\": \"Tổng thanh toán\",\n" +
//                "    \"English value\": \"Total payment\",\n" +
//                "    \"Peru value\": \"Pago total\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"description_confirm_send_sms_payment\",\n" +
//                "    \"Vietnam value\": \"(đã gồm phí thanh toán qua tin nhắn)\",\n" +
//                "    \"English value\": \"(including SMS payment fee)\",\n" +
//                "    \"Peru value\": \"(incluye tarifa de pago por SMS)\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"write_sms\",\n" +
//                "    \"Vietnam value\": \"Soạn SMS\",\n" +
//                "    \"English value\": \"Compose SMS\",\n" +
//                "    \"Peru value\": \"Redactar SMS\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"send_sms\",\n" +
//                "    \"Vietnam value\": \"Gửi SMS\",\n" +
//                "    \"English value\": \"Send SMS\",\n" +
//                "    \"Peru value\": \"Enviar SMS\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"package_price\",\n" +
//                "    \"Vietnam value\": \"Giá gói\",\n" +
//                "    \"English value\": \"Package price\",\n" +
//                "    \"Peru value\": \"Precio del paquete\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"no_payment_method\",\n" +
//                "    \"Vietnam value\": \"Gói cước này chỉ có thể thanh toán bằng SĐT Viettel,  vui lòng đăng nhập SĐT Viettel để thực hiện.\",\n" +
//                "    \"English value\": \"This package can only be paid by Bitel phone number, please log in with Bitel phone number to do so.\",\n" +
//                "    \"Peru value\": \"Este paquete solo se puede pagar con el número de teléfono de Bitel; inicie sesión en el número de teléfono de Bitel para hacerlo.\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_donate\",\n" +
//                "    \"Vietnam value\": \"Xác Nhận Ủng Hộ\",\n" +
//                "    \"English value\": \"Confirm Support\",\n" +
//                "    \"Peru value\": \"Confirmar soporte\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"note_text\",\n" +
//                "    \"Vietnam value\": \"Ghi chú:\",\n" +
//                "    \"English value\": \"Note:\",\n" +
//                "    \"Peru value\": \"Nota:\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"confirm_error_zalo\",\n" +
//                "    \"Vietnam value\": \"Xác thực liên kết Zalopay thất bại\",\n" +
//                "    \"English value\": \"Zalopay link authentication failed\",\n" +
//                "    \"Peru value\": \"La autenticación del enlace de Zalopay falló\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"present_no_payment_method\",\n" +
//                "    \"Vietnam value\": \"Phương thức không được hỗ trợ\",\n" +
//                "    \"English value\": \"Method not supported\",\n" +
//                "    \"Peru value\": \"Método no compatible\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"dialog_confirm_remove_history_text_description\",\n" +
//                "    \"Vietnam value\": \"Bạn có muốn xóa lịch sử xem không?\",\n" +
//                "    \"English value\": \"Do you want to clear your watch history?\",\n" +
//                "    \"Peru value\": \"¿Quieres borrar tu historial de reproducciones?\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_next_cancel_btn_text\",\n" +
//                "    \"Vietnam value\": \"Bỏ qua\",\n" +
//                "    \"English value\": \"Skip\",\n" +
//                "    \"Peru value\": \"Saltar\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_next_cancel_next_text\",\n" +
//                "    \"Vietnam value\": \"Xem ngay\",\n" +
//                "    \"English value\": \"Watch now\",\n" +
//                "    \"Peru value\": \"Ver ahora\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"auto_next_timer_text\",\n" +
//                "    \"Vietnam value\": \"%1$s tiếp theo sẽ phát sau <b>%2$ds</b>\",\n" +
//                "    \"English value\": \"Next %1$s will play after <b>%2$ds</b>\",\n" +
//                "    \"Peru value\": \"El próximo %1$s se reproducirá después de <b>%2$ds</b>\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"Key\": \"\",\n" +
//                "    \"Vietnam value\": \"\",\n" +
//                "    \"English value\": \"\",\n" +
//                "    \"Peru value\": \"\",\n" +
//                "    \"Scenario Vietnam\": \"\",\n" +
//                "    \"Scenario Image (Optional)\": \"\"\n" +
//                "  }\n" +
//                "]");
//
//
//        for (int i = 0; i < jsonArray.length(); i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            System.out.println(jsonObject.toString());
//        }
//    }
//
//}
