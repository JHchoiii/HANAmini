//package com.HanaMini.security.jwt;
//
//import java.util.Collection;
//import java.util.List;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//@Getter
//@RequiredArgsConstructor
//public class CustomUserDetails implements UserDetails {
//  private final UserDTO userDTO;
//
//  @Override
//  public Collection<? extends GrantedAuthority> getAuthorities() {
//    return List.of();
//  }
//
//  @Override
//  public String getPassword() {
//    return userDTO.getUserPw();
//  }
//
//  @Override
//  public String getUsername() {
//    return userDTO.getName();
//  }
//
//  @Override
//  public boolean isAccountNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isAccountNonLocked() {
//    return true;
//  }
//
//  @Override
//  public boolean isCredentialsNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isEnabled() {
//    return true;
//  }
//
//}
