package com.fernandodev.usuario.business;

import com.fernandodev.usuario.business.converter.UsuarioConverter;
import com.fernandodev.usuario.business.dto.UsuarioDTO;
import com.fernandodev.usuario.infrastructure.entity.Usuario;
import com.fernandodev.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor


public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }

}
