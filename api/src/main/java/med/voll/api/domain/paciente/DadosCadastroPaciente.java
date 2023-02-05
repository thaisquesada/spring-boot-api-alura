package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(

    @NotBlank(message = "O nome é obrigatório.")
    String nome,

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "O formato do email é inválido.")
    String email,

    @NotBlank(message = "O telefone é obrigatório.")
    String telefone,

    @NotBlank(message = "O CPF é obrigatório.")
    @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}", message = "O formato do CPF é inválido.")
    String cpf,

    @NotBlank(message = "Os dados do endereço são obrigatórios.")
    @Valid
    DadosEndereco endereco) {

}