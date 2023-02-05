package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank(message = "O nome é obrigatório.")
        String nome,

        @NotBlank(message = "O email é obrigatório.")
        @Email(message = "O formato do email é inválido.")
        String email,

        @NotBlank(message = "O telefone é obrigatório.")
        String telefone,

        @NotBlank(message = "O CRM é obrigatório.")
        @Pattern(regexp = "\\d{4,6}", message = "O formato do CRM é inválido.")
        String crm,

        @NotNull(message = "A especialidade é obrigatória.")
        Especialidade especialidade,

        @NotNull(message = "Os dados do endereço são obrigatórios.")
        @Valid
        DadosEndereco endereco) {
}