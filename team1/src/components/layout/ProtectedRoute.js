import React from "react";
import { Navigate, Outlet } from "react-router-dom";
import { useSelector } from "react-redux";

/**
 * 로그인 필수 라우트 보호 컴포넌트
 * - 로그인하지 않은 사용자는 로그인 페이지로 리다이렉트
 */
const ProtectedRoute = () => {
    const loginState = useSelector((state) => state.loginSlice);

    // 로그인 안 됨
    if (!loginState || !loginState.employeeNo) {
        return <Navigate to="/" replace />;
    }

    // ✅ 로그인 되어 있으면 자식 라우트 렌더링
    return <Outlet />;
};

export default ProtectedRoute;
